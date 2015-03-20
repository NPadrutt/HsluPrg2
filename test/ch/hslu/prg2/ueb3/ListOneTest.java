package ch.hslu.prg2.ueb3;

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
public class ListOneTest {

    @Test
    public void testAdd() {        
        int item = 0;
        ListOne instance = new ListOne();
        instance.add(item);
    }

    /**
     * Test of remove method, of class ListOne.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int item = 0;
        ListOne instance = new ListOne();
        boolean expResult = false;
        boolean result = instance.remove(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeValue method, of class ListOne.
     */
    @Test
    public void testRemoveValue() {
        System.out.println("removeValue");
        int value = 0;
        ListOne instance = new ListOne();
        boolean expResult = false;
        boolean result = instance.removeValue(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeValues method, of class ListOne.
     */
    @Test
    public void testRemoveValues() {
        System.out.println("removeValues");
        int value = 0;
        ListOne instance = new ListOne();
        boolean expResult = false;
        boolean result = instance.removeValues(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class ListOne.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ListOne instance = new ListOne();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exists method, of class ListOne.
     */
    @Test
    public void testExists() {
        System.out.println("exists");
        int item = 0;
        ListOne instance = new ListOne();
        boolean expResult = false;
        boolean result = instance.exists(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class ListOne.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        ListOne instance = new ListOne();
        instance.print();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
