/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.ueb2.Uebung1.Uebung2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nino
 */
public class RingbufferTest {
    

    @Test
    public void testEnqueue() {
        Ringbuffer test = new Ringbuffer(6);
        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
        test.enqueue(4);
        test.enqueue(5);
    }
    
    @Test
    public void testEnqueueSizeLimit(){
        Ringbuffer test = new Ringbuffer(2);
        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
    }

    @Test
    public void testDequeue() {
        Ringbuffer test = new Ringbuffer(2);
        test.enqueue(1);
        test.enqueue(2);
        
        Object result = test.dequeue();
        
        assertEquals(1, result);
    }

    @Test
    public void testIsEmpty() {
    }

    @Test
    public void testIsFull() {
    }
    
}
