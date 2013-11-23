/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:44
 *	File: ZkCdiException.java
 *	Package: net.empego.zkcdi
 * 
 *  $Id: ZkCdiException.java 29 2011-10-30 18:45:52Z oberinspector $ 
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

package net.empego.zkcdi;

/**
 * The Class ZkCdiException.
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
public class ZkCdiException extends RuntimeException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 417204701972216524L;

	/**
	 * Instantiates a new zk cdi exception.
	 * 
	 * @param cause
	 *          the cause
	 */
	public ZkCdiException(final Throwable cause) {
		super(cause);
	}

	/**
	 * Instantiates a new zk cdi exception.
	 * 
	 * @param message
	 *          the message
	 * @param cause
	 *          the cause
	 */
	public ZkCdiException(final String message, final Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new zk cdi exception.
	 * 
	 * @param message
	 *          the message
	 */
	public ZkCdiException(final String message) {
		super(message);
	}

	/**
	 * Instantiates a new zk cdi exception.
	 */
	public ZkCdiException() {
	}

}
