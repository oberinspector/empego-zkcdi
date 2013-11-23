/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:44
 *	File: ObservesZkEvent.java
 *	Package: net.empego.zkcdi.event
 * 
 *  $Id: ObservesZkEvent.java 30 2011-10-30 20:30:35Z oberinspector $ 
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

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * The Interface ObservesZkEvent is used to bind ZK-events to an eventhandler method of a controller class (e.g. composer).
 * 
 * <p>
 * Not a CDIEvent observer nor a CDI qualifier, but a trigger to add an event lissener for a component in IdSpace.
 * </p>
 * Usage: <code>public void sayHello(@ObservesZkEvent("sayHelloBtn.onClick") final MouseEvent evt) {...</code> observes the onClick
 * MouseEvent of the component with id="sayHelloBtn".
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
@Retention(RUNTIME)
@Target({ PARAMETER })
@Inherited
public @interface ObservesZkEvent {

	/**
	 * Value.
	 * 
	 * @return the string
	 */
	public String value();
}
