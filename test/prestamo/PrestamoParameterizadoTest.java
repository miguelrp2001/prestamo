/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author miguel_roman_parraga
 * 
 */

@RunWith(Parameterized.class)
public class PrestamoParameterizadoTest {
    
    int cantidad;
    String expResult;
    
    public PrestamoParameterizadoTest(int cant, String expRes) {
        this.cantidad = cant;
        this.expResult = expRes;
    }

    /*

Pruebas de equivalencia:
        - Caso 1: La cantidad está dentro del rango (entre 1000 y 15000), devuelve, Felicidades, préstamo concedido.
        - Caso 2: La cantidad está por debajo del límite mínimo (menor a 1000), devuelve, Préstamo no concedido carece de interes.
        - Caso 3: La cantidad está por encima del límite superior (mayor a 15000), devuelve, Préstamo no concedido es una operación con demasiado riesgo.

Pruebas de valores borde:
        - Caso 4: La cantidad está justo en el límite inferior (1000), devuelve, Felicidades, préstamo concedido.
        - Caso 5: La cantidad está justo en el límite superior (15000), devuelve, Felicidades, préstamo concedido.

*/
    
    
    @Parameters
    public static Iterable<Object[]> parametros() {
        return Arrays.asList(new Object[][]{
            {1500,"Felicidades, préstamo concedido"},{500,"Préstamo no concedido carece de interes"},{15500,"Préstamo no concedido es una operación con demasiado riesgo"},{1000,"Felicidades, préstamo concedido"},{15000,"Felicidades, préstamo concedido"},
    });
    }
    

    /**
     * Pruebas parameterizadas.
     */
    
    @Test
    public void testParameterizado() {
        Prestamo instance = new Prestamo();
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
    }
    
}
