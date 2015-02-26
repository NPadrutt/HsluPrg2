/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.ueb2.Uebung1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nino
 */
public class StackTest {
    
    @Test
    public void testPush() {
        String item = "hello world";
        Stack instance = new Stack();
        instance.push(item);
    }
    
    @Test
    public void testPop(){
        String item = "hello world";
        Stack instance = new Stack();
        instance.push(item);
        
        String result = instance.pop();
        assertEquals(result, item);
    }
    
    @Test
    public void testPopOrder() {
        String item = "hello world";
        String item2 = "second hello world";
        Stack instance = new Stack();
        instance.push(item);
        instance.push(item2);
        
        String result = instance.pop();
        assertEquals(result, item2);
    }
}
