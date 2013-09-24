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




package debug;

public class EDebug {
	
	public static boolean setFind = false;
	private static String getFileName(){
		return Thread.currentThread().getStackTrace()[3].getClassName();
	}
	private static String getClassName(){
		return Thread.currentThread().getStackTrace()[3].getClassName();
	}
	private static String getMethodName(){
		return Thread.currentThread().getStackTrace()[3].getMethodName();
	}
	private static int getLineNumber(){
		return Thread.currentThread().getStackTrace()[3].getLineNumber();
	}
    public static void print (Object s){
        if (setFind)
            System.out.println(getFileName() +":" +getClassName() +":"+  getMethodName() +":"+ getLineNumber());	
        System.out.println(s);
    }
}
