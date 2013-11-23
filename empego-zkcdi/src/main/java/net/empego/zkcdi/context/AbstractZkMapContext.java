/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:44
 *	File: AbstractZkMapContext.java
 *	Package: net.empego.zkcdi.context
 * 
 *  $Id: AbstractZkMapContext.java 29 2011-10-30 18:45:52Z oberinspector $ 
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
package net.empego.zkcdi.context;

import static org.jboss.weld.logging.messages.ContextMessage.CONTEXTUAL_IS_NULL;
import static org.jboss.weld.logging.messages.ContextMessage.NO_BEAN_STORE_AVAILABLE;

import java.lang.annotation.Annotation;
import java.util.Map;

import javax.enterprise.context.ContextNotActiveException;
import javax.enterprise.context.spi.Context;
import javax.enterprise.context.spi.Contextual;
import javax.enterprise.context.spi.CreationalContext;

import org.jboss.weld.Container;
import org.jboss.weld.context.api.BeanStore;
import org.jboss.weld.context.api.ContextualInstance;
import org.jboss.weld.context.api.helpers.ConcurrentHashMapBeanStore;
import org.jboss.weld.exceptions.IllegalArgumentException;
import org.jboss.weld.exceptions.IllegalStateException;
import org.jboss.weld.serialization.spi.ContextualStore;

/**
 * The Class AbstractZkMapContext is the abstract base class for all ZK-related contexts.
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
public abstract class AbstractZkMapContext implements Context {

	public static final String ZK_CDI_BEAN_STORE = "ZK_CDI_BEAN_STORE";

	private final Class<? extends Annotation> scopeType;

	/**
	 * Instantiates a new abstract zk map context.
	 * 
	 * @param scopeType
	 *          the scope type
	 */
	public AbstractZkMapContext(final Class<? extends Annotation> scopeType) {
		this.scopeType = scopeType;
	}

	@Override
	public Class<? extends Annotation> getScope() {
		return scopeType;
	}

	/**
	 * Cleanup.
	 */
	public void cleanup() {
		if (getBeanStore() != null) {
			getBeanStore().clear();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.enterprise.context.spi.Context#get(javax.enterprise.context.spi.Contextual, javax.enterprise.context.spi.CreationalContext)
	 */
	@Override
	public <T> T get(final Contextual<T> contextual, final CreationalContext<T> creationalContext) {

		if (!isActive()) {
			throw new ContextNotActiveException();
		}

		if (getBeanStore() == null) {
			return null;
		}

		if (contextual == null) {
			throw new IllegalArgumentException(CONTEXTUAL_IS_NULL);
		}

		final String id = getId(contextual);
		ContextualInstance<T> beanInstance = getBeanStore().get(id);

		if (beanInstance != null) {
			return beanInstance.getInstance();
		} else if (creationalContext != null) {
			final T instance = contextual.create(creationalContext);
			if (instance != null) {
				beanInstance = getContextualStore().getSerializableContextualInstance(contextual, instance, creationalContext);
				getBeanStore().put(id, beanInstance);
			}
			return instance;
		} else {
			return null;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.enterprise.context.spi.Context#get(javax.enterprise.context.spi.Contextual)
	 */
	@Override
	public <T> T get(final Contextual<T> contextual) {
		return get(contextual, null);
	}

	/**
	 * Destroy.
	 * 
	 * @param <T>
	 *          the generic type
	 * @param id
	 *          the id
	 */
	private <T> void destroy(final String id) {
		if (getBeanStore() == null) {
			throw new IllegalStateException(NO_BEAN_STORE_AVAILABLE, this);
		}
		final ContextualInstance<T> beanInstance = getBeanStore().get(id);
		beanInstance.getContextual().destroy(beanInstance.getInstance(), beanInstance.getCreationalContext());
	}

	/**
	 * Destroy.
	 */
	public void destroy() {
		if (getBeanStore() == null) {
			throw new IllegalStateException(NO_BEAN_STORE_AVAILABLE, this);
		}
		for (final String id : getBeanStore().getContextualIds()) {
			destroy(id);
		}
		getBeanStore().clear();
	}

	@Override
	public boolean isActive() {
		return getScopeAttributes() != null;
	}

	protected abstract Map<String, Object> getScopeAttributes();

	private BeanStore getBeanStore() {
		final Map<String, Object> attrs = getScopeAttributes();
		if (attrs != null) {
			BeanStore beanstore = (BeanStore) attrs.get(ZK_CDI_BEAN_STORE);
			if (beanstore == null) {
				beanstore = new ConcurrentHashMapBeanStore();
				attrs.put(ZK_CDI_BEAN_STORE, beanstore);
			}
			return beanstore;
		}
		return null;
	}

	/**
	 * Gets the contextual.
	 * 
	 * @param <T>
	 *          the generic type
	 * @param id
	 *          the id
	 * @return the contextual
	 */
	protected static <T> Contextual<T> getContextual(final String id) {
		return getContextualStore().<Contextual<T>, T> getContextual(id);
	}

	/**
	 * Gets the id.
	 * 
	 * @param contextual
	 *          the contextual
	 * @return the id
	 */
	protected static String getId(final Contextual<?> contextual) {
		return getContextualStore().putIfAbsent(contextual);
	}

	protected static ContextualStore getContextualStore() {
		return Container.instance().services().get(ContextualStore.class);
	}

}
