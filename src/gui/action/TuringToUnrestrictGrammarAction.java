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
import gui.environment.GrammarEnvironment;
import gui.grammar.automata.ConvertController;
import gui.grammar.automata.ConvertPane;
import gui.grammar.automata.TuringConvertController;
import gui.viewer.SelectionDrawer;
import automata.Automaton;
import automata.turing.TuringMachine;

/**
 * Class for converting Turing Machine to Unrestricted Grammar
 * @author Kyung Min (Jason) Lee
 *
 */
public class TuringToUnrestrictGrammarAction extends ConvertAutomatonToGrammarAction{

	public TuringToUnrestrictGrammarAction(AutomatonEnvironment automatonEnvironment) {
		super("Convert to Unrestricted Grammar", automatonEnvironment);
		// TODO Auto-generated constructor stub
	}

	@Override
	//TODO: Need to put error check, make sure there is only one letter popping and placing
	// More error check?
	protected boolean checkAutomaton() {
		// TODO Auto-generated method stub
		//return true for now
		return true;
	}

	@Override
	protected ConvertController initializeController(ConvertPane pane,
			SelectionDrawer drawer, Automaton automaton) {
		// TODO Auto-generated method stub
		return new TuringConvertController(pane, drawer,
				(TuringMachine) automaton);
	}

	public static boolean isApplicable(Object object) {
		return object instanceof TuringMachine;
	}

}
