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
public class SituacaoIT {
    
    public SituacaoIT() {
    }
    
    Situacao sit = new Situacao();
    
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
     * Test of Informar_Situacao method, of class Situacao.
     */
    @Test
    public void testInformar_Situacao() {
        assertEquals("Indisponivel", sit.Informar_Situacao('A'));
        assertEquals("Disponivel", sit.Informar_Situacao('B'));
        assertEquals("Em atraso", sit.Informar_Situacao('C'));
        assertEquals("Data de Devolução: ", sit.Informar_Situacao('D'));
        assertEquals("Multa: ", sit.Informar_Situacao('E'));
        assertEquals("Devolvido!", sit.Informar_Situacao('F'));
        assertEquals("Erro", sit.Informar_Situacao('Z'));
    }

    /**
     * Test of Situacao_Emprestimo method, of class Situacao.
     */
    @Test
    public void testSituacao_Emprestimo() {
       //teste1
        sit.Situacao_Emprestimo(2);
         assertEquals("Disponivel", sit.getSituacao());
       //teste2
       sit.Situacao_Emprestimo(0);
         assertEquals("Indisponivel", sit.getSituacao());

    }

    /**
     * Test of Status_Emprestimo method, of class Situacao.
     */
    @Test
    public void testStatus_Emprestimo() {
        //teste1
        sit.Status_Emprestimo(true);
        assertEquals("Devolvido!", sit.getSituacao());
        //teste2
        sit.Status_Emprestimo(false);
        assertEquals("Em atraso", sit.getSituacao());
    }
    
}
