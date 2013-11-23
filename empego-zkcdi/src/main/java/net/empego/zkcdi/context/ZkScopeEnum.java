/***************************************************************************  
 *	Project: empego-zkcdi
 *	Created: 30.10.2011, 17:36:43
 *	File: ZkScopeEnum.java
 *	Package: net.empego.zkcdi.context
 * 
 *  $Id: ZkScopeEnum.java 29 2011-10-30 18:45:52Z oberinspector $ 
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

/**
 * The Enum ZkScopeEnum.
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
public enum ZkScopeEnum {

	/** The DESKTOP. */
	DESKTOP("desktop"), //
	/** The PAGE. */
	PAGE("page"), //
	/** The IDSPACE. */
	IDSPACE("spaceOwner"), //
	/** The COMPNENT. */
	COMPNENT("self"), //
	/** The EXECUTION. */
	EXECUTION(null); //

	/** The skope name. */
	private final String skopeName;

	/**
	 * Instantiates a new zk scope enum.
	 * 
	 * @param skopeName
	 *          the skope name
	 */
	private ZkScopeEnum(final String skopeName) {
		this.skopeName = skopeName;
	}

	public String getSkopeName() {
		return skopeName;
	}
}
