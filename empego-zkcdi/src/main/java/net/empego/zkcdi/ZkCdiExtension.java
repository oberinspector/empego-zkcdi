/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:42
 *	File: ZkCdiExtension.java
 *	Package: net.empego.zkcdi
 * 
 *  $Id: ZkCdiExtension.java 30 2011-10-30 20:30:35Z oberinspector $ 
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
package net.empego.zkcdi;

import java.util.logging.Logger;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.AfterBeanDiscovery;
import javax.enterprise.inject.spi.BeanManager;
import javax.enterprise.inject.spi.Extension;

import net.empego.zkcdi.context.ComponentContext;
import net.empego.zkcdi.context.DesktopContext;
import net.empego.zkcdi.context.ExecutionContext;
import net.empego.zkcdi.context.IdSpaceContext;
import net.empego.zkcdi.context.PageContext;

/**
 * The Class ZkCdiExtension.
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
public class ZkCdiExtension implements Extension {
	private static final Logger LOG = Logger.getLogger(ZkCdiExtension.class.getName());

	/**
	 * After bean discovery initializes the ZK-specific contexts.
	 * 
	 * @param event
	 *          the event
	 * @param beanManager
	 *          the bean manager
	 */
	public void afterBeanDiscovery(@Observes final AfterBeanDiscovery event, final BeanManager beanManager) {
		event.addContext(new DesktopContext());
		event.addContext(new PageContext());
		event.addContext(new IdSpaceContext());
		event.addContext(new ComponentContext());
		event.addContext(new ExecutionContext());
		LOG.info(Version.ID + " successfully registered.");
	}

}
