package com.mycompany.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author admin
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    /**
     * Test of suma method, of class Calculadora.
     */
    @Test
    @DisplayName("Suma")
    public void testSuma() {
        System.out.println("suma");
        Calculadora instance = new Calculadora(2, 4);
        int expResult = 6;
        int result = instance.suma();
        assertEquals(expResult, result);
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        Calculadora instance = new Calculadora(4, 2);
        int expResult = 2;
        int result = instance.resta();
        assertEquals(expResult, result);
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        Calculadora instance = new Calculadora(2, 4);
        int expResult = 8;
        int result = instance.multiplica();
        assertEquals(expResult, result);
    }

    /**
     * Test of divide method, of class Calculadora.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        Calculadora instance = new Calculadora(4, 2);
        int expResult = 2;
        int result = instance.divide();
        assertEquals(expResult, result);
    }
    
}
