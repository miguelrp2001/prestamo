/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author miguel_roman_parraga
 */
public class PrestamoTestEquivalenciaBACTest {
    
    private static Prestamo instance;
    
    public PrestamoTestEquivalenciaBACTest() {
    }
    
    @BeforeClass  
    public static void beforeClass() {
        System.out.print("beforeClass(): ");
        System.out.println("Generación de instancia de prestamo.");
        instance = new Prestamo();

    }
    
    @AfterClass  
    public static void afterClass() {
        System.out.print("afterClass(): ");
        System.out.println("Eliminar la instancia de prestamo.");
        instance = new Prestamo();

    }
    
    
    /**
     * Caso 1: La cantidad está dentro del rango (entre 1000 y 15000), devuelve, Felicidades, préstamo concedido.
     */
    
    @Test
    public void caso1bac() {
        System.out.println("Caso 1: La cantidad está dentro del rango (entre 1000 y 15000), devuelve, Felicidades, préstamo concedido.");
        int cantidad = 1500;
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
    }
    
    /**
     * Caso 2: La cantidad está por debajo del límite mínimo (menor a 1000), devuelve, Préstamo no concedido carece de interes.
     */
    
    @Test
    public void caso2bac() {
        System.out.println("Caso 2: La cantidad está por debajo del límite mínimo (menor a 1000), devuelve, Préstamo no concedido carece de interes.");
        int cantidad = 500;
        String expResult = "Préstamo no concedido carece de interes";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
    }
    
    /**
     * Caso 3: La cantidad está por encima del límite superior (mayor a 15000), devuelve, Préstamo no concedido es una operación con demasiado riesgo.
     */
    
    @Test
    public void caso3bac() {
        System.out.println("Caso 3: La cantidad está por encima del límite superior (mayor a 15000), devuelve, Préstamo no concedido es una operación con demasiado riesgo.");
        int cantidad = 15500;
        String expResult = "Préstamo no concedido es una operación con demasiado riesgo";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
    }
    
}
