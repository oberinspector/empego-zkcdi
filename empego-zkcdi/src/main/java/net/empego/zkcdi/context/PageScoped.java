/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:43
 *	File: PageScoped.java
 *	Package: net.empego.zkcdi.context
 * 
 *  $Id: PageScoped.java 29 2011-10-30 18:45:52Z oberinspector $ 
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

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.enterprise.context.NormalScope;

/**
 * The Interface PageScoped binds CDI-beans to the life cycle of a ZK id page.
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
@Target({ TYPE, METHOD, FIELD })
@Retention(RUNTIME)
@Documented
@NormalScope(passivating = true)
@Inherited
public @interface PageScoped {
}
