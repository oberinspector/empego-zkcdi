/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:44
 *	File: ExecutionContext.java
 *	Package: net.empego.zkcdi.context
 * 
 *  $Id: ExecutionContext.java 29 2011-10-30 18:45:52Z oberinspector $ 
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

import org.zkoss.zk.ui.Execution;
import org.zkoss.zk.ui.Executions;

/**
 * Context for ZK-{@link ExecutionScoped} CDI-Beans.
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
public class ExecutionContext extends AbstractZkMapContext {

	/**
	 * Instantiates a new execution context.
	 */
	public ExecutionContext() {
		super(ExecutionScoped.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Map<String, Object> getScopeAttributes() {
		final Execution exec = Executions.getCurrent();
		if (exec == null) {
			return null;
		}

		return exec.getAttributes();
	}
}
