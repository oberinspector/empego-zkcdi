/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:43
 *	File: ZkEventHandler.java
 *	Package: net.empego.zkcdi.event
 * 
 *  $Id: ZkEventHandler.java 29 2011-10-30 18:45:52Z oberinspector $ 
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
package net.empego.zkcdi.event;

import org.zkoss.zk.ui.event.EventListener;

/**
 * The Interface ZkEventHandler.
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
public interface ZkEventHandler extends EventListener {
	public ZkEventListener getZkEventListener();
}
