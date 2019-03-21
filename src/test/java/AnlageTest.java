/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mwimm
 */
public class AnlageTest {
    
    public AnlageTest() {
    }

    /**
     * Test of jahresAfa method, of class Anlage.
     */
    @Test
    public void testJahresAfa() {
        Anlage a=new Anlage(2000.0,10);
        assertEquals(200.0, a.jahresAfa(),0.01);
        
    }
    public void testBuchwert1(){
        Anlage a =new Anlage(2000.0,10);
        a.updateBuchwert(5);
        assertEquals(1000.0,a.getBuchwert(), 0.01);
    }
        public void testBuchwert2(){
        Anlage a =new Anlage(2000.0,10);
        assertEquals(0.0,a.getBuchwert(), 0.01);
    }

    /**
     * Test of updateBuchwert method, of class Anlage.
     */

    
}
