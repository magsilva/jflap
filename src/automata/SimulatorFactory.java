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
 * This simulator factory returns the simulator for the type of automaton passed
 * in.
 * 
 * @author Thomas Finley
 */

public class SimulatorFactory {
	/**
	 * Returns the automaton simulator for this type of automaton.
	 * 
	 * @param automaton
	 *            the automaton to get the simulator for
	 * @return the appropriate automaton simulator for this automaton, or <CODE>null</CODE>
	 *         if there is no automaton simulator known for this type of
	 *         automaton
	 */
	public static AutomatonSimulator getSimulator(Automaton automaton) {
		if (automaton instanceof automata.fsa.FiniteStateAutomaton)
			return new automata.fsa.FSAStepWithClosureSimulator(automaton);
		else if (automaton instanceof automata.pda.PushdownAutomaton)
			return new automata.pda.PDAStepWithClosureSimulator(automaton);
		else if (automaton instanceof automata.turing.TuringMachine)
			return new automata.turing.TMSimulator(automaton);
        /*
         * Check for Moore must take place before check for Mealy because Moore
         * is a subclass of Mealy.
         */
        else if(automaton instanceof automata.mealy.MooreMachine)
            return new automata.mealy.MooreStepByStateSimulator(automaton);
        else if(automaton instanceof automata.mealy.MealyMachine)
            return new automata.mealy.MealyStepByStateSimulator(automaton);
		return null;
	}
}
