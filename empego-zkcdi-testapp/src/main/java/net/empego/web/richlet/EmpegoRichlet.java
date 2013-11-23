/***************************************************************************  
 *	Project: empego-zkcdi-testapp
 *	Created: 30.10.2011, 21:59:15
 *	File: EmpegoRichlet.java
 *	Package: net.empego.web.richlet
 * 
 *  $Id: EmpegoRichlet.java 33 2011-10-30 21:01:41Z oberinspector $ 
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
package net.empego.web.richlet;

import javax.inject.Inject;

import net.empego.zkcdi.util.ZkCdiUtils;

import org.zkoss.zk.ui.GenericRichlet;
import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.RichletConfig;

/**
 * The Class EmpegoRichlet.
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
public class EmpegoRichlet extends GenericRichlet {

	@Inject
	private DesktopControl desktopControl;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.zkoss.zk.ui.GenericRichlet#init(org.zkoss.zk.ui.RichletConfig)
	 */
	@Override
	public void init(final RichletConfig config) {
		super.init(config);
		ZkCdiUtils.inject(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.zkoss.zk.ui.Richlet#service(org.zkoss.zk.ui.Page)
	 */
	@Override
	public void service(final Page page) throws Exception {
		desktopControl.service(page);
	}

}
