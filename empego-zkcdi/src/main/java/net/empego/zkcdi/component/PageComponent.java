/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:43
 *	File: PageComponent.java
 *	Package: net.empego.zkcdi.component
 * 
 *  $Id: PageComponent.java 29 2011-10-30 18:45:52Z oberinspector $ 
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
 * The Annotation PageComponent is used to specify the path of the component to be injected in an controller class.
 * 
 * <p>
 * PageComponent is not a CDI qualifier... with the string-based lookup in id-space the type safety is already lost.
 * </p>
 * <code>
 * Usage: @Inject @PageComponent("path/to/myTextboxInIdSpace") Textbox tb;</li> </code>
 * <p>
 * Retrieves the textbox component from
 * </p>
 * <code>&lt;div id="path">&lt;div id="to">&lt;textbox id="myTextboxInIdSpace"/>&lt;/div>&lt;/div></code> from page.
 * <p>
 * Uses org.zkoss.zk.ui.Path.getComponent(path);
 * </p>
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
@Retention(RUNTIME)
@Target({ METHOD, PARAMETER, FIELD })
public @interface PageComponent {
	/**
	 * The path to the component.
	 * 
	 * @return
	 */
	String value();
}
