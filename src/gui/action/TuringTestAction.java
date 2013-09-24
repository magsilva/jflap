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

import file.Codec;
import file.DataException;
import file.ParseException;
import gui.environment.Environment;
import gui.environment.EnvironmentFrame;
import gui.environment.FrameFactory;
import gui.environment.Universe;

import java.awt.AWTException;
import java.awt.Component;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileFilter;

import automata.Automaton;
import automata.turing.TuringMachine;

/**
* The <CODE>TestTuringAction</CODE> is an action to load a structure from a file,
* and create a new environment with that object.
* 
* @author Stephen Reading
*/

public class TuringTestAction extends TestAction {


    /**
     * Instantiates a new <CODE>Turing Test Action</CODE>.
     */
    public TuringTestAction() {
        //super("Test Turing Machines", null);
        super("Test Turing Machines", KeyEvent.VK_T);       
    }
    
    protected void displayMultipleRunPane(Environment env){
    		MultipleOutputSimulateAction act = new MultipleOutputSimulateAction((Automaton)myObjects.get(0),env);
    		act.performAction(env);
    		env.getTag(env.getActive());
    	}

    

}
