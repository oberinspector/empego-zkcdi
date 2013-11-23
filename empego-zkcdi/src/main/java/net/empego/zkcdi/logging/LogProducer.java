/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:44
 *	File: LogProducer.java
 *	Package: net.empego.zkcdi.logging
 * 
 *  $Id: LogProducer.java 38 2011-12-03 09:13:04Z oberinspector $ 
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
package net.empego.zkcdi.logging;

import java.util.logging.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 * The Class LogProducer produces a Logger instance for the classname injection points beanclass.
 * 
 * <p>
 * Usage: @Inject Loger log;
 * </p>
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
public class LogProducer {

	/**
	 * Creates the loggger.
	 * 
	 * @param ip
	 *          Injection point where the logger is injected
	 * 
	 * @return the logger
	 */
	@Produces
	public Logger createLoggger(final InjectionPoint ip) {
		return Logger.getLogger(ip.getMember().getDeclaringClass().getName());
	}
}
