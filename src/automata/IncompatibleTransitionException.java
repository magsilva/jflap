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
 * This class is an exception that is thrown in the event an incompatible <CODE>Transition</CODE>
 * object is assigned to an automaton.
 * 
 * @see automata.Automaton
 * @see automata.Transition
 * @see automata.Automaton#getTransitionClass
 * @see automata.Automaton#addTransition
 * @author Thomas Finley
 */

public class IncompatibleTransitionException extends RuntimeException {

}
