/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:43
 *	File: PersistenceContextProvider.java
 *	Package: net.empego.zkcdi.persistence
 * 
 *  $Id: PersistenceContextProvider.java 29 2011-10-30 18:45:52Z oberinspector $ 
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
package net.empego.zkcdi.persistence;

import javax.annotation.PreDestroy;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import net.empego.zkcdi.context.ExecutionScoped;

@ExecutionScoped
public abstract class PersistenceContextProvider {

	protected abstract EntityManagerFactory getEntityManagerFactory();

	private EntityManager em;

	/**
	 * Retrieve or create EntityManager and start transaction when necessary.
	 * 
	 * @return an EntityManager with started Transaction.
	 */
	public EntityManager getEntityManager() {
		if (em == null) {
			em = getEntityManagerFactory().createEntityManager();
		}

		if (em.getTransaction().isActive() == false) {
			em.getTransaction().begin();
		}
		return em;
	}

	@PreDestroy
	public void destroy() {
		if (em != null && em.isOpen() == true) {
			em.getTransaction().commit();
			em.close();
		}
	}

	public void rollback() {
		try {
			if (em != null && em.isOpen() == true && em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		} finally {
			em.close();
		}
	}

}
