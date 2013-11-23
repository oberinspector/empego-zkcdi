/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:42
 *	File: PageContext.java
 *	Package: net.empego.zkcdi.context
 * 
 *  $Id: PageContext.java 29 2011-10-30 18:45:52Z oberinspector $ 
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

import net.empego.zkcdi.util.ZkCdiUtils;

/**
 * Context for {@link PageScoped} CDI-Beans.
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
public class PageContext extends AbstractZkMapContext {

	/**
	 * Instantiates a new page context.
	 */
	public PageContext() {
		super(PageScoped.class);
	}

	@Override
	protected Map<String, Object> getScopeAttributes() {
		return ZkCdiUtils.getScopeAttributes(ZkScopeEnum.PAGE);
	}
}
