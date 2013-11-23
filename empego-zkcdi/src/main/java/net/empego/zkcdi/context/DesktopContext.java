/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:44
 *	File: DesktopContext.java
 *	Package: net.empego.zkcdi.context
 * 
 *  $Id: DesktopContext.java 29 2011-10-30 18:45:52Z oberinspector $ 
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

import java.util.Map;

import org.zkoss.zk.ui.Desktop;
import org.zkoss.zk.ui.Execution;
import org.zkoss.zk.ui.Executions;

/**
 * Context for ZK-{@link DesktopScoped} CDI-beans.
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
public class DesktopContext extends AbstractZkMapContext {

	/**
	 * Instantiates a new desktop context.
	 */
	public DesktopContext() {
		super(DesktopScoped.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Map<String, Object> getScopeAttributes() {
		final Execution exec = Executions.getCurrent();
		if (exec == null) {
			return null;
		}

		final Desktop desktop = exec.getDesktop();
		if (desktop == null) {
			return null;
		}

		return desktop.getAttributes();
	}

}
