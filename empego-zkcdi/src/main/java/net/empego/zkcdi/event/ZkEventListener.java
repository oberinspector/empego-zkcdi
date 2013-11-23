/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:44
 *	File: ZkEventListener.java
 *	Package: net.empego.zkcdi.event
 * 
 *  $Id: ZkEventListener.java 29 2011-10-30 18:45:52Z oberinspector $ 
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

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.empego.zkcdi.util.ZkCdiUtils;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.ForwardEvent;

/**
 * The listener interface for receiving zkEvent events. The class that is interested in processing a zkEvent event implements this
 * interface, and the object created with that class is registered with a component using the component's
 * <code>addZkEventListener<code> method. When the zkEvent event occurs, that object's appropriate method is invoked.
 * 
 */
public class ZkEventListener implements EventListener {

	private final Map<String, List<Method>> eventsMap = new HashMap<String, List<Method>>();
	private final Object controller;

	/**
	 * Instantiates a new zk event listener.
	 * 
	 * @param controller
	 *          the controller
	 */
	public ZkEventListener(final Object controller) {
		super();
		if (controller == null) {
			throw new IllegalArgumentException("Eventhandler must not be null");
		}
		this.controller = controller;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.zkoss.zk.ui.event.EventListener#onEvent(org.zkoss.zk.ui.event.Event)
	 */
	@Override
	public void onEvent(final Event zkEvent) throws Exception {
		if (zkEvent != null && zkEvent.getName() != null) {
			final Event originalEvent;
			if (zkEvent instanceof ForwardEvent) {
				originalEvent = org.zkoss.zk.ui.event.Events.getRealOrigin((ForwardEvent) zkEvent);
			} else {
				originalEvent = zkEvent;
			}
			final Component target = originalEvent.getTarget();
			ZkCdiUtils.setSkopeComponent(target);

			final String eventId = target.getId() + "." + originalEvent.getName();
			final List<Method> methods = eventsMap.get(eventId);
			for (final Method method : methods) {
				final Class<?>[] parameterTypes = method.getParameterTypes();
				if (parameterTypes.length != 1 || parameterTypes[0].isAssignableFrom(originalEvent.getClass()) == false) {
					throw new IllegalArgumentException("Eventhandler method " + method.getName() + " must have one parameter with type "
							+ originalEvent.getClass().getName());
				}
				method.invoke(controller, originalEvent);
			}

		}
	}

	public Map<String, List<Method>> getEventsMap() {
		return eventsMap;
	}

}
