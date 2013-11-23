/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:42
 *	File: ZkEventListenerUtils.java
 *	Package: net.empego.zkcdi.event
 * 
 *  $Id: ZkEventListenerUtils.java 29 2011-10-30 18:45:52Z oberinspector $ 
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

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.empego.zkcdi.util.ZkCdiUtils;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.IdSpace;
import org.zkoss.zk.ui.event.Event;

/**
 * The Class ZkEventListenerUtils.
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
public class ZkEventListenerUtils {

	/**
	 * Builds the event listener.
	 * 
	 * @param controller
	 *          the controller
	 * @return the zk event listener
	 */
	public static ZkEventListener buildEventListener(final ZkEventHandler controller) {

		final ZkEventListener listener = new ZkEventListener(controller);
		initializeEventHandling(controller, listener);
		return listener;
	}

	/**
	 * Initialize event handling.
	 * 
	 * @param controller
	 *          the controller
	 * @param listener
	 *          the listener
	 */
	private static void initializeEventHandling(final ZkEventHandler controller, final ZkEventListener listener) {
		if (controller == null || ZkCdiUtils.getSkopeIdSpace() == null) {
			return;
		}
		final Method[] methods = controller.getClass().getMethods();
		for (final Method method : methods) {
			final Annotation[][] parameterAnnotations = method.getParameterAnnotations();
			final Class<?>[] parameterTypes = method.getParameterTypes();

			int i = 0;
			for (final Annotation[] annotations : parameterAnnotations) {
				for (final Annotation annotation : annotations) {
					if (annotation instanceof ObservesZkEvent) {
						final Class<?> observedEventclazz = parameterTypes[i];

						// only handle ZK-events
						if (Event.class.isAssignableFrom(observedEventclazz)) {
							final String value = ((ObservesZkEvent) annotation).value();

							addForwardEvent(value, method, controller, listener, ZkCdiUtils.getSkopeIdSpace());
						}
					}
				}
				i++;
			}

		}

	}

	/**
	 * Adds the forward event.
	 * 
	 * @param value
	 *          the value
	 * @param method
	 *          the method
	 * @param controller
	 *          the controller
	 * @param listener
	 *          the listener
	 * @param idSpace
	 *          the id space
	 */
	private static void addForwardEvent(final String value, final Method method, final ZkEventHandler controller,
			final ZkEventListener listener, final IdSpace idSpace) {
		final Map<String, List<Method>> eventsMap = listener.getEventsMap();

		final String[] envents = value.split(",");
		for (final String singleEvent : envents) {
			final String[] split = singleEvent.trim().split("\\.");
			final String id = split[0].trim();
			final String event = split[1].trim();
			final Component target = idSpace.getFellowIfAny(id, true);

			if (target != null) {
				target.addEventListener(event, controller);
				List<Method> listenerValues = eventsMap.get(singleEvent);
				if (listenerValues == null) {
					listenerValues = new ArrayList<Method>();
					eventsMap.put(singleEvent, listenerValues);
				}
				listenerValues.add(method);
			}
		}
	}

}
