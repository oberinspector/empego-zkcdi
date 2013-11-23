/***************************************************************************  
 *	Project: empego-zkcdi-testapp
 *	Created: 30.10.2011, 21:59:15
 *	File: DesktopControl.java
 *	Package: net.empego.web.richlet
 * 
 *  $Id: DesktopControl.java 33 2011-10-30 21:01:41Z oberinspector $ 
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
import java.util.logging.Logger;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

import net.empego.zkcdi.context.DesktopScoped;

import org.zkoss.zk.ui.Page;
import org.zkoss.zk.ui.event.BookmarkEvent;

/**
 * The Class DesktopControl.
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
@DesktopScoped
public class DesktopControl implements Serializable {

	private static final long serialVersionUID = -3840972188001208401L;

	@Inject
	private Logger log;

	@Inject
	private EmpegoPrincipal principal;

	private Page page;

	/**
	 * On bookmark change.
	 * 
	 * @param bookmarkEvent
	 *          the bookmark event
	 */
	public void onBookmarkChange(@Observes final BookmarkEvent bookmarkEvent) {
	}

	/**
	 * Service.
	 * 
	 * @param page
	 *          the page
	 */
	public void service(final Page page) {
		this.page = page;
	}

}
