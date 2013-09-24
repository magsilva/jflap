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

import gui.environment.AutomatonEnvironment;
import gui.environment.Universe;
import gui.environment.tag.CriticalTag;
import gui.regular.ConvertPane;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import automata.fsa.FSAToRegularExpressionConverter;

/**
 * This action handles the conversion of an FSA to a regular expression.
 * 
 * @author Thomas Finley
 */

public class ConvertFSAToREAction extends FSAAction {
	/**
	 * Instantiates a new <CODE>ConvertFSAToREAction</CODE>.
	 * 
	 * @param environment
	 *            the environment
	 */
	public ConvertFSAToREAction(AutomatonEnvironment environment) {
		super("Convert FA to RE", null);
		this.environment = environment;
	}

	/**
	 * This method begins the process of converting an automaton to a regular
	 * expression.
	 * 
	 * @param event
	 *            the action event
	 */
	public void actionPerformed(ActionEvent event) {
		JFrame frame = Universe.frameForEnvironment(environment);
		if (environment.getAutomaton().getInitialState() == null) {
			JOptionPane.showMessageDialog(frame,
					"Conversion requires an automaton\nwith an initial state!",
					"No Initial State", JOptionPane.ERROR_MESSAGE);
			return;
		}
		if (environment.getAutomaton().getFinalStates().length == 0) {
			JOptionPane.showMessageDialog(frame,
					"Conversion requires at least\n" + "one final state!",
					"No Final States", JOptionPane.ERROR_MESSAGE);
			return;
		}
		ConvertPane pane = new ConvertPane(environment);
		environment.add(pane, "Convert FA to RE", new CriticalTag() {
		});
		environment.setActive(pane);
	}

	/** The automaton environment. */
	private AutomatonEnvironment environment;

}
