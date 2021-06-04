/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author miguel_roman_parraga
 */
public class PrestamoTestBordeBATest {

    private static Prestamo instance;

    public PrestamoTestBordeBATest() {
    }

    @Before
    public void before() {
        System.out.print("before(): ");
        System.out.println("Generación de instancia de prestamo.");
        instance = new Prestamo();

    }

    @After
    public void after() {
        System.out.print("after(): ");
        System.out.println("Eliminar la instancia de prestamo.");
        instance = new Prestamo();

    }

    /**
     * Caso 4: La cantidad está justo en el límite inferior (1000), devuelve,
     * Felicidades, préstamo concedido.
     */
    @Test
    public void caso4ba() {
        System.out.println("Caso 4: La cantidad está justo en el límite inferior (1000), devuelve, Felicidades, préstamo concedido.");
        int cantidad = 1000;
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
    }

    /**
     * Caso 5: La cantidad está justo en el límite superior (15000), devuelve,
     * Felicidades, préstamo concedido.
     */
    @Test
    public void caso5ba() {
        System.out.println("Caso 5: La cantidad está justo en el límite superior (15000), devuelve, Felicidades, préstamo concedido.");
        int cantidad = 15000;
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
    }

}
