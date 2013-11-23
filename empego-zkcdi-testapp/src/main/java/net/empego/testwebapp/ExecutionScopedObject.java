/***************************************************************************  
 *	Project: empego-zkcdi-testapp
 *	Created: 30.10.2011, 21:58:48
 *	File: ExecutionScopedObject.java
 *	Package: net.empego.testwebapp
 * 
 *  $Id: ExecutionScopedObject.java 33 2011-10-30 21:01:41Z oberinspector $ 
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

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import net.empego.zkcdi.context.ExecutionScoped;

/**
 * The Class ExecutionScopedObject.
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
@ExecutionScoped
@Named
public class ExecutionScopedObject {

	@Inject
	Logger log;

	private final String created = "EXECUTION: " + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());

	public String getCreated() {
		return created;
	}

	/**
	 * Destroy.
	 */
	@PreDestroy
	public void destroy() {
		log.info("ExecutionScopedObject (created: " + created + ") destroyed");
	}

}
