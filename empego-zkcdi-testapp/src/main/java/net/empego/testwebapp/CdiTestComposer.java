/***************************************************************************  
 *	Project: empego-zkcdi-testapp
 *	Created: 30.10.2011, 21:58:48
 *	File: CdiTestComposer.java
 *	Package: net.empego.testwebapp
 * 
 *  $Id: CdiTestComposer.java 40 2012-07-03 07:59:08Z oberinspector $ 
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
import java.util.Date;

import javax.inject.Inject;

import net.empego.zkcdi.component.IdSpaceComponent;
import net.empego.zkcdi.event.ObservesZkEvent;
import net.empego.zkcdi.util.ZkCdiEventHandlerComposer;

import org.zkoss.zk.ui.event.MouseEvent;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;

/**
 * The Class CdiTestComposer is a ZK-composer to demonstrate basic CDI features of empego-zkcdi.
 * 
 * @author <a href="mailto:thomas.mueller@empego.net">Thomas Müller</a>
 */
public class CdiTestComposer extends ZkCdiEventHandlerComposer implements Serializable {

	private static final long serialVersionUID = -780924738611367996L;

	@Inject
	private Textbox guestName;

	@Inject
	@IdSpaceComponent("guestName")
	private Textbox tb;

	@Inject
	private Label sessionLabel;
	@Inject
	private Label desktopLabel;
	@Inject
	private Label executionLabel;

	@Inject
	ExecutionScopedObject executionScopedObject;
	@Inject
	DesktopScopedObject desctopScopedObject;
	@Inject
	SessionScopedObject sessionScopedObject;

	/**
	 * Say hello.
	 * 
	 * @param evt
	 *          the evt
	 */
	public void sayHello(@ObservesZkEvent("sayHelloBtn.onClick") final MouseEvent evt) {
		guestName.setValue("Labels are updated at " + new Date());

		// Update labels
		sessionLabel.setValue(sessionScopedObject.getCreated());
		desktopLabel.setValue(desctopScopedObject.getCreated());
		executionLabel.setValue(executionScopedObject.getCreated());
	}
}
