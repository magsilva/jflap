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

import grammar.Grammar;
import grammar.parse.Operations;
import gui.environment.EnvironmentFrame;
import gui.environment.GrammarEnvironment;
import gui.environment.Universe;
import gui.environment.tag.CriticalTag;
import gui.grammar.parse.LLParseTableDerivationPane;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

/**
 * This is an action to build an LL(1) parse table for a grammar.
 * 
 * @author Thomas Finley
 */

public class LLParseTableAction extends GrammarAction {
	/**
	 * Instantiates a new <CODE>GrammarOutputAction</CODE>.
	 * 
	 * @param environment
	 *            the grammar environment
	 */
	public LLParseTableAction(GrammarEnvironment environment) {
		super("Build LL(1) Parse Table", null);
		this.environment = environment;
		this.frame = Universe.frameForEnvironment(environment);
	}

	/**
	 * Performs the action.
	 */
	public void actionPerformed(ActionEvent e) {
		Grammar g = environment.getGrammar();
		if (g == null)
			return;
		if (!Operations.isLL1(g)) {
			if (JOptionPane.showConfirmDialog(frame,
					"The grammar is not LL(1).\nContinue anyway?",
					"Grammar not LL(1)", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION)
				return;
		}

		LLParseTableDerivationPane ptdp = new LLParseTableDerivationPane(
				environment);
		environment.add(ptdp, "Build LL(1) Parse", new CriticalTag() {
		});
		environment.setActive(ptdp);
	}

	/** The grammar environment. */
	private GrammarEnvironment environment;

	/** The frame for the grammar environment. */
	private EnvironmentFrame frame;
}
