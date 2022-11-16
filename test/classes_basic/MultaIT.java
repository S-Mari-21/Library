/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package classes_basic;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gabi
 */
public class MultaIT {
    
    public MultaIT() {
    }
    
    Multa multa = new Multa("20/10/2022", "10/10/2022");
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of Dias_Atrasados method, of class Multa.
     */
    @Test
    public void testDias_Atrasados() {
        assertTrue(2 == multa.Dias_Atrasados(2, "20/10/2022", "22/10/2022"));
    }

    /**
     * Test of Multa method, of class Multa.
     */
    @Test
    public void testMulta() {
        assertTrue(10.00==multa.Multa(10));
    }
    
}
