/*
 *  JFLAP - Formal Languages and Automata Package
 * 
 * 
 *  Susan H. Rodger
 *  Computer Science Department
 *  Duke University
 *  August 27, 2009

 *  Copyright (c) 2002-2009
 *  All rights reserved.

 *  JFLAP is open source software. Please see the LICENSE for terms.
 *
 */




package gui.action;


import gui.environment.Universe;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.net.URL;


import javax.swing.Action;

public class OpenURLAction extends RestrictedAction {
	
	public OpenURLAction(){
		super("Open URL", null);
	}

	public boolean isEnabled() {
		if(Universe.CHOOSER == null) return true; 
		return false;
	}

	public void actionPerformed(ActionEvent e) {
		
	}

}
