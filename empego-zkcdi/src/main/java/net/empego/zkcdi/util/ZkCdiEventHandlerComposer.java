/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:43
 *	File: ZkCdiEventHandlerComposer.java
 *	Package: net.empego.zkcdi.util
 * 
 *  $Id: ZkCdiEventHandlerComposer.java 29 2011-10-30 18:45:52Z oberinspector $ 
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

import java.io.Serializable;

import net.empego.zkcdi.context.IdSpaceScoped;
import net.empego.zkcdi.event.ZkEventHandler;
import net.empego.zkcdi.event.ZkEventListener;
import net.empego.zkcdi.event.ZkEventListenerUtils;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.Composer;

@IdSpaceScoped
public class ZkCdiEventHandlerComposer implements Composer, ZkEventHandler, Serializable {

	private static final long serialVersionUID = -2700201645528998915L;

	private ZkEventListener eventListener;

	@Override
	public void doAfterCompose(final Component comp) throws Exception {
		ZkCdiUtils.initController(this, comp, null);
		eventListener = ZkEventListenerUtils.buildEventListener(this);
	}

	@Override
	public void onEvent(final Event event) throws Exception {
		if (eventListener != null) {
			eventListener.onEvent(event);
		}
	}

	@Override
	public ZkEventListener getZkEventListener() {
		return eventListener;
	}

}
