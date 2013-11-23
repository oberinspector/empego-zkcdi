/***************************************************************************  
 *	Project: empego-zkcdi-testapp
 *	Created: 30.10.2011, 21:59:15
 *	File: EmpegoPrincipal.java
 *	Package: net.empego.web.richlet
 * 
 *  $Id: EmpegoPrincipal.java 33 2011-10-30 21:01:41Z oberinspector $ 
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
package net.empego.web.richlet;

import java.io.Serializable;
import java.security.Principal;
import java.util.Date;

import javax.enterprise.context.SessionScoped;

/**
 * The Class EmpegoPrincipal.
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
@SessionScoped
public class EmpegoPrincipal implements Principal, Serializable {

	private static final long serialVersionUID = 959483144732448758L;

	private final String created = "created: " + new Date().toString();

	@Override
	public String getName() {
		return created;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return created;
	}

}
