/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:43
 *	File: IdSpaceComponent.java
 *	Package: net.empego.zkcdi.component
 * 
 *  $Id: IdSpaceComponent.java 29 2011-10-30 18:45:52Z oberinspector $ 
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
package net.empego.zkcdi.component;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * The Annotation IdSpaceComponent is used to specify the id of the component to be injected in an controller class.
 * 
 * <p>
 * IdSpaceComponent is not a CDI qualifier... with the string-based lookup in id-space the type safety is already lost. As default id the
 * name of the property (the InjectionPoint) is used.
 * </p>
 * <code>
 * Usage:
 * <ul>
 * <li>@Inject @IdSpaceComponent("myTextboxInIdSpace") Textbox tb;</li>
 * <li>@Inject @IdSpaceComponent() Textbox myTextboxInIdSpace;</li>
 * <li>@Inject Textbox myTextboxInIdSpace;</li>
 * </code>
 * <p>
 * Retrieves the textbox component from <code>&lt;textbox id="myTextboxInIdSpace"/></code> from idspace.
 * </p>
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
@Retention(RUNTIME)
@Target({ METHOD, PARAMETER, FIELD })
public @interface IdSpaceComponent {

	/**
	 * Value.
	 * 
	 * @return the string
	 */
	String value() default "";
}
