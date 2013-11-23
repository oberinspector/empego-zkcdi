/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:43
 *	File: ZkCdiUtils.java
 *	Package: net.empego.zkcdi.util
 * 
 *  $Id: ZkCdiUtils.java 29 2011-10-30 18:45:52Z oberinspector $ 
 * 
 *
 * 	Copyright (C) 2011 empego.net. All Rights Reserved.
 *
 *
 *	This program is distributed under LGPL Version 3.0.
 *  See the LICENSE at http://www.gnu.org/licenses/lgpl-3.0.html
 *  I hope it will be useful, but WITHOUT ANY WARRANTY.
 *
 ***************************************************************************/
package net.empego.zkcdi.util;

import java.util.Map;

import javax.enterprise.context.spi.CreationalContext;
import javax.enterprise.inject.spi.Annotated;
import javax.enterprise.inject.spi.AnnotatedType;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.enterprise.inject.spi.InjectionTarget;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import net.empego.zkcdi.ZkCdiException;
import net.empego.zkcdi.component.IdSpaceComponent;
import net.empego.zkcdi.component.PageComponent;
import net.empego.zkcdi.context.ZkScopeEnum;

import org.zkoss.xel.VariableResolver;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Execution;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.IdSpace;
import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.Path;
import org.zkoss.zk.ui.ext.Scope;

/**
 * Utility functions for EMPEGO-ZKCDI.
 * 
 * @author Thomas Müller thomas.mueller@empego.net
 */
/**
 * @author Thomas
 * 
 */
public class ZkCdiUtils {

	private static BeanManager beanManager;
	private static ThreadLocal<Component> threadLocalComponent = new ThreadLocal<Component>();
	private static ThreadLocal<Page> threadLocalPage = new ThreadLocal<Page>();
	private static ThreadLocal<IdSpace> threadLocalIdSpace = new ThreadLocal<IdSpace>();

	/**
	 * Retrieve the BeanManager
	 * 
	 * @return BeanManager
	 */
	public static BeanManager getBeanManager() {
		if (beanManager != null) {
			return beanManager;
		}

		try {
			final InitialContext initialContext = new InitialContext();
			beanManager = (BeanManager) initialContext.lookup("java:comp/BeanManager");
		} catch (final NamingException e) {
			throw new ZkCdiException("Cannot locate the BeanManager.", e);
		}
		return beanManager;
	}

	/**
	 * Init the controller related to an componentInspace and/or a Page.
	 * 
	 * <p>
	 * Puts controller related component, idSpace and page in ThreadLocal variables.
	 * 
	 * @param controller
	 * @param componentInSpace
	 */
	public static void initController(final Object controller, final Component componentInSpace, final Page page) {
		// place the component in Space in ThreadLocal to perform injection
		if (componentInSpace != null) {
			threadLocalComponent.set(componentInSpace);
			threadLocalIdSpace.set(componentInSpace.getSpaceOwner());
		} else if (page != null && page.getFirstRoot() != null) {
			threadLocalComponent.set(page.getFirstRoot());
		} else {
			threadLocalComponent.remove();
		}

		if (page != null) {
			threadLocalPage.set(page);
			threadLocalIdSpace.set(page);
		} else if (componentInSpace != null) {
			threadLocalPage.set(componentInSpace.getPage());
		} else {
			threadLocalPage.remove();
		}

		if (page == null && componentInSpace == null) {
			threadLocalIdSpace.remove();
		}

		// perform injection
		inject(controller);

		// Init eventhandling
		// initializeEventHandling(controller);
	}

	/**
	 * Perform injection in obj which is instantiated by the framework but not by CDI.
	 * 
	 * @param <T>
	 * @param obj
	 *          - The instance to inject beans into
	 */
	public static <T> void inject(final Object obj) {
		final BeanManager beanManager = ZkCdiUtils.getBeanManager();

		// CDI uses an AnnotatedType object to read the annotations of a class
		final AnnotatedType<T> type = (AnnotatedType<T>) beanManager.createAnnotatedType(obj.getClass());

		// The extension uses an InjectionTarget to delegate instantiation,
		// dependency injection
		// and lifecycle callbacks to the CDI container
		final InjectionTarget<T> it = beanManager.createInjectionTarget(type);
		// each instance needs its own CDI CreationalContext
		final CreationalContext instanceContext = beanManager.createCreationalContext(null);

		it.inject((T) obj, instanceContext); // call initializer methods and
		// perform field injection
		it.postConstruct((T) obj); // call the @PostConstruct method
	}

	/**
	 * Destroys the CDI managed bean.
	 * 
	 * @param obj
	 */
	public static <T> void destroy(final T obj) {

		final BeanManager beanManager = ZkCdiUtils.getBeanManager();

		// CDI uses an AnnotatedType object to read the annotations of a class
		final AnnotatedType<T> type = (AnnotatedType<T>) beanManager.createAnnotatedType(obj.getClass());

		// The extension uses an InjectionTarget to delegate instantiation,
		// dependency injection
		// and lifecycle callbacks to the CDI container
		final InjectionTarget<T> it = beanManager.createInjectionTarget(type);
		// each instance needs its own CDI CreationalContext
		final CreationalContext ctx = beanManager.createCreationalContext(null);
		// destroy the framework component instance and clean up dependent
		// objects
		it.preDestroy(obj); // call the @PreDestroy method
		it.dispose(obj); // it is now safe to discard the instance

	}

	/**
	 * A helper for the generated producer methods to retrieve components from their path or their id in idSpace.
	 * 
	 * @param injectionPoint
	 * @return the component or null when not found
	 * @throws ZkCdiException
	 *           when both component qualifiers (@IdSpaceComponetn and @PageComponent) are used together.
	 */
	public static Component produceComponent(final InjectionPoint injectionPoint) {
		final Annotated annotated = injectionPoint.getAnnotated();

		final IdSpaceComponent idSpaceAnnotation = annotated.getAnnotation(IdSpaceComponent.class);
		final PageComponent pageAnnotation = annotated.getAnnotation(PageComponent.class);
		if (pageAnnotation != null && idSpaceAnnotation != null) {
			throw new ZkCdiException("Unambigious injection point: " + injectionPoint.getMember().getName()
					+ " Only one of @IdSpaceComponent or @PageComponent is allowed.");
		}
		if (pageAnnotation != null) {
			final String path = pageAnnotation.value();
			if (path == null || path.isEmpty()) {
				throw new ZkCdiException("Unsatisfied injection point: " + injectionPoint.getMember().getName() + " no value specified");
			}
			return Path.getComponent(path);
		}

		if (idSpaceAnnotation != null) {
			// Find component by specified id (value of IdSpaceComponent annotation)
			final String id = idSpaceAnnotation.value();
			if (id != null && id.isEmpty() == false) {
				final IdSpace idSpace = threadLocalIdSpace.get();
				if (idSpace == null) {
					return null;
				}
				return idSpace.getFellow(id, true);
			}
		}
		// no id specified in IdSpaceComponent or no IdSpaceComponent annotation.
		// Use member name as id
		final String id = injectionPoint.getMember().getName();
		final IdSpace idSpace = threadLocalIdSpace.get();
		if (idSpace == null) {
			return null;
		}
		return idSpace.getFellow(id, true);
	}

	/**
	 * Retrieves the controller related ThreadLocal component.
	 * 
	 * @return
	 */
	public static Component getSkopeComponent() {
		return threadLocalComponent.get();
	}

	/**
	 * Set the controller related Component to Threadlocal.
	 * 
	 * @param component
	 */
	public static void setSkopeComponent(final Component component) {
		if (component != null) {
			threadLocalComponent.set(component);
			threadLocalIdSpace.set(component.getSpaceOwner());
			threadLocalPage.set(component.getPage());
		}
	}

	/**
	 * Retrieve the controller related page from ThreadLocal.
	 * 
	 * @return
	 */
	public static Page getSkopePage() {
		return threadLocalPage.get();
	}

	/**
	 * Set the controller related page to ThreadLocal.
	 * 
	 * @param page
	 */
	public static void setSkopePage(final Page page) {
		if (page != null) {
			threadLocalComponent.set(page.getFirstRoot());
			threadLocalIdSpace.set(page);
			threadLocalPage.set(page);
		}
	}

	/**
	 * Retrieve the controller related IdSPace from ThreadLocal.
	 * 
	 * @return
	 */
	public static IdSpace getSkopeIdSpace() {
		return threadLocalIdSpace.get();
	}

	/**
	 * Set the controller related IdSpace to ThreadLocal.
	 * 
	 * @param idSpace
	 */
	public static void setSkopePage(final IdSpace idSpace) {
		if (idSpace != null) {
			threadLocalComponent.remove();
			threadLocalIdSpace.set(idSpace);
			threadLocalPage.remove();
		}
	}

	/**
	 * Retrieves the attributes map for the specific scope when scope is active.
	 * 
	 * @param zKskopeName
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, Object> getScopeAttributes(final ZkScopeEnum zKskopeEnum) {

		final Execution exec = Executions.getCurrent();

		if (exec == null) {
			return null;
		}

		if (ZkScopeEnum.EXECUTION.equals(zKskopeEnum)) {
			return exec.getAttributes();
		}

		final VariableResolver variableResolver = exec.getVariableResolver();
		if (variableResolver == null) {
			return null;
		}
		final Scope zkScope = (Scope) variableResolver.resolveVariable(zKskopeEnum.getSkopeName());

		if (zkScope == null) {
			return null;
		}

		return zkScope.getAttributes();
	}

}
