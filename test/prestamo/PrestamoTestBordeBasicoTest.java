/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miguel_roman_parraga
 */
public class PrestamoTestBordeBasicoTest {
    
    public PrestamoTestBordeBasicoTest() {
    }

      
    /**
     * Caso 4: La cantidad está justo en el límite inferior (1000), devuelve, Felicidades, préstamo concedido.
     */
    
    @Test
    public void caso4() {
        System.out.println("Caso 4: La cantidad está justo en el límite inferior (1000), devuelve, Felicidades, préstamo concedido.");
        int cantidad = 1000;
        Prestamo instance = new Prestamo();
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
    }
    
    /**
     * Caso 5: La cantidad está justo en el límite superior (15000), devuelve, Felicidades, préstamo concedido.
     */
    
    @Test
    public void caso5() {
        System.out.println("Caso 5: La cantidad está justo en el límite superior (15000), devuelve, Felicidades, préstamo concedido.");
        int cantidad = 15000;
        Prestamo instance = new Prestamo();
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
    }
    
    
}
