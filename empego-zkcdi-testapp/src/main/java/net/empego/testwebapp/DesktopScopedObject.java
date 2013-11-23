/***************************************************************************  
 *	Project: empego-zkcdi-testapp
 *	Created: 30.10.2011, 21:58:48
 *	File: DesktopScopedObject.java
 *	Package: net.empego.testwebapp
 * 
 *  $Id: DesktopScopedObject.java 35 2011-11-16 19:06:36Z oberinspector $ 
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
package net.empego.testwebapp;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import javax.annotation.PreDestroy;
import javax.inject.Named;

import net.empego.zkcdi.context.DesktopScoped;

/**
 * The Class DesktopScopedObject.
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
@DesktopScoped
@Named
public class DesktopScopedObject implements Serializable {

	private static final long serialVersionUID = -6802017580272794322L;

	private final Logger log = Logger.getLogger(DesktopScopedObject.class.getName());

	private final String created = "DESKTOP: " + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());

	public String getCreated() {
		return created;
	}

	/**
	 * Destroy.
	 */
	@PreDestroy
	public void destroy() {
		log.info("DesktopScopedObject (created: " + created + ") destroyed");
	}

}
