/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.ueb1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nino
 */
public class SparTest {

    @Test
    public void testGetSaldo() {
        
        Spar spar = new Spar(300, 0.08, 400);        
        double result = spar.getSaldo();        
        
        assertEquals(300, result, 0.01);
    }
    
    @Test
    public void testPayIn(){
        Spar spar = new Spar(300, 0.08, 400);
        spar.payIn(50);
        
        assertEquals(350, spar.getSaldo(), 0.001);
    }

    @Test
    public void testPayOut() {
        Spar spar = new Spar(300, 0.08, 400);
        spar.payOut(50);
        
        assertEquals(250, spar.getSaldo(), 0.001);        
    }
    
    @Test
    public void testPayOutMaxOut() {
        Spar spar = new Spar(300, 0.08, 50);
        spar.payOut(80);
        
        assertEquals(300, spar.getSaldo(), 0.001);        
    }    
}
