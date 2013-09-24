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





package gui.pumping;

import java.util.*;
import pumping.reg.*;

/**
 * A <code>RegPumpingLemmaChooser</code> is a <code>PumpingLemmaChooser</code> 
 * for {@link pumping.RegularPumpingLemma}s.
 * 
 * @author Jinghui Lim
 *
 */
public class RegPumpingLemmaChooser extends PumpingLemmaChooser 
{
    /**
     * Adds all the regular pumping lemmas.
     *
     */
    public RegPumpingLemmaChooser()
    {
        myList = new ArrayList();
        
        //old languages
        myList.add(new AnBn());
        myList.add(new NaNb());
        myList.add(new Palindrome());
        myList.add(new ABnAk());
        myList.add(new AnBkCnk());
        myList.add(new AnBlAk());
        myList.add(new AnEven());
        
        //new languages (JFLAP 6.2)
        myList.add(new AnBk());
        myList.add(new BBABAnAn());
        myList.add(new B5W());
        myList.add(new B5Wmod());
        myList.add(new BkABnBAn());
        myList.add(new AB2n());        
    }
}
