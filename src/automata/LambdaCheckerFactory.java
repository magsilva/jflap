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





package automata;

/**
 * This lambda checker factory returns a lambda transition checker for the type
 * of automaton passed in.
 * 
 * @author Ryan Cavalcante
 */

public class LambdaCheckerFactory {
	/**
	 * Returns the lambda transition checker for the type of automaton that
	 * <CODE>automaton</CODE> is.
	 * 
	 * @param automaton
	 *            the automaton to get the checker for
	 * @return the lambda transition checker for the type of automaton that
	 *         <CODE>automaton</CODE> is or <CODE>null</CODE> if there is no
	 *         lambda transition checker for this type of automaton
	 */
	public static LambdaTransitionChecker getLambdaChecker(Automaton automaton) {
		if (automaton instanceof automata.fsa.FiniteStateAutomaton)
			return new automata.fsa.FSALambdaTransitionChecker();
		else if (automaton instanceof automata.pda.PushdownAutomaton)
			return new automata.pda.PDALambdaTransitionChecker();
		else if (automaton instanceof automata.turing.TuringMachine)
			return new automata.turing.TMLambdaTransitionChecker();
        else if(automaton instanceof automata.mealy.MealyMachine)
            return new automata.mealy.MealyLambdaTransitionChecker();
		return null;
	}

}
