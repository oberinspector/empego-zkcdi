/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:44
 *	File: ZkCdiScopeListener.java
 *	Package: net.empego.zkcdi.context
 * 
 *  $Id: ZkCdiScopeListener.java 29 2011-10-30 18:45:52Z oberinspector $ 
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

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;

import org.jboss.weld.context.api.BeanStore;
import org.jboss.weld.context.api.ContextualInstance;
import org.zkoss.zk.ui.Desktop;
import org.zkoss.zk.ui.Execution;
import org.zkoss.zk.ui.util.DesktopCleanup;
import org.zkoss.zk.ui.util.ExecutionCleanup;

/**
 * The ZkCdiScopeListener handles lifecycle events of ZK-skopes.
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
public class ZkCdiScopeListener implements ExecutionCleanup, DesktopCleanup {
	private static final Logger LOG = Logger.getLogger(ZkCdiScopeListener.class.getName());

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.zkoss.zk.ui.util.ExecutionCleanup#cleanup(org.zkoss.zk.ui.Execution, org.zkoss.zk.ui.Execution, java.util.List)
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public void cleanup(final Execution exec, final Execution parent, final List errs) throws Exception {
		final BeanStore beanStore = (BeanStore) exec.getAttribute(ExecutionContext.ZK_CDI_BEAN_STORE);
		destroyBeanStore(beanStore, errs);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.zkoss.zk.ui.util.DesktopCleanup#cleanup(org.zkoss.zk.ui.Desktop)
	 */

	@Override
	public void cleanup(final Desktop desktop) throws Exception {
		final BeanStore beanStore = (BeanStore) desktop.getAttribute(DesktopContext.ZK_CDI_BEAN_STORE);
		destroyBeanStore(beanStore, null);
	}

	/**
	 * Destroy bean store.
	 * 
	 * @param <T>
	 *          the generic type
	 * @param beanStore
	 *          the bean store
	 * @param errs
	 *          the errs
	 */
	private <T> void destroyBeanStore(final BeanStore beanStore, final List errs) {

		if (beanStore == null) {
			return;
		}

		for (final String id : beanStore.getContextualIds()) {
			final ContextualInstance<T> beanInstance = beanStore.get(id);

			// Check for open EntityManager in view
			handleOpenEntityManagerInView(beanInstance, errs);

			beanInstance.getContextual().destroy(beanInstance.getInstance(), beanInstance.getCreationalContext());

		}
		beanStore.clear();
	}

	/**
	 * Checks if beanInstance represents an EntityManager and ends the EntityManager (experimental and not tested).
	 * 
	 * @param <T>
	 *          the generic type
	 * @param beanInstance
	 *          the bean instance
	 * @param errs
	 *          the errs
	 */
	private <T> void handleOpenEntityManagerInView(final ContextualInstance<T> beanInstance, final List errs) {

		if (beanInstance.getInstance() instanceof EntityManager) {
			try {
				final EntityManager em = (EntityManager) beanInstance.getInstance();

				if (errs != null && errs.isEmpty() == false) {
					if (em.getTransaction().isActive()) {
						em.getTransaction().rollback();
						LOG.warning("Transaction is rolled back beacause errors occured in execution: " + ((Throwable) errs.get(0)).getMessage());
					} else {
						LOG.warning("Transaction not active and can not be rolled back. Errors occured in execution: "
								+ ((Throwable) errs.get(0)).getMessage());
					}
				} else {
					em.getTransaction().commit();
					em.close();
					LOG.finest("Transaction commited successfully.");

				}
			} catch (final IllegalStateException e) {
				// Handles only ResourceLocal TransactionTypes
				LOG.warning("EntityManager not handled by ZkCdiScopeListener PersistenceUnit is not of transaction type RESOURCE_LOCAL: "
						+ e.getMessage());
			} catch (final Exception e) {
				LOG.warning("Error while closing EntityManager: " + e.getMessage());
			}

		}
	}
}
