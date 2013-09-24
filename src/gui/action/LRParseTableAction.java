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
import gui.environment.EnvironmentFrame;
import gui.environment.GrammarEnvironment;
import gui.environment.Universe;
import gui.environment.tag.*;
import gui.grammar.parse.*;
import java.awt.event.ActionEvent;

/**
 * This is an action to build an LR(1) parse table for a grammar.
 * 
 * @author Thomas Finley
 */

public class LRParseTableAction extends GrammarAction {
	/**
	 * Instantiates a new <CODE>GrammarOutputAction</CODE>.
	 * 
	 * @param environment
	 *            the grammar environment
	 */
	public LRParseTableAction(GrammarEnvironment environment) {
		super("Build SLR(1) Parse Table", null);
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
		LRParseTableDerivationPane ptdp = new LRParseTableDerivationPane(
				environment);
        if(ptdp.getAugmentedGrammar() == null) return;
		environment.add(ptdp, "Build SLR(1) Parse", new CriticalTag() {
		});
		environment.setActive(ptdp);
	}

	/** The grammar environment. */
	private GrammarEnvironment environment;

	/** The frame for the grammar environment. */
	private EnvironmentFrame frame;
}
