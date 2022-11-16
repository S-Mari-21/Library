/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package classes_premium;

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
public class PagamentoIT {
    
    public PagamentoIT() {
    }
    
    Pagamento pagamento = new Pagamento();
    
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
     * Test of Alugar method, of class Pagamento.
     */
    @Test
    public void testAlugar() {
        assertTrue((double)pagamento.Alugar(5.00, 2) == 7.00);
    }

    /**
     * Test of Comprar method, of class Pagamento.
     */
    @Test
    public void testComprar() {
        assertTrue((double)pagamento.Comprar(25.00) == 45.00);
    }
    
}
