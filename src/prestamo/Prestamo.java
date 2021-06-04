/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

/**
 *
 * @author Javier Bustamante Toledo
 * 
 * Situación: Supongamos que tenemos una aplicación que autoriza el prestamo de una 
 * cantidad de dinero (valor numérico) si en importe se encuentra entre 1000 y 15000. 
 * Por lo tanto, 
 *  Todo préstamo por debajo de 1000 carece de interes y 
 *  Por encima de 15000 es una operación con demasiado riesgo.
 * 
 */
public class Prestamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public String estudio (int cantidad) {
        String sRespuesta;
        
            if (cantidad >= 1000 && cantidad <=15000) {
                sRespuesta = "Felicidades, préstamo concedido";
            } else if (cantidad < 1000) {
                sRespuesta = "Préstamo no concedido carece de interes";
            } else {
                sRespuesta= "Préstamo no concedido es una operación con demasiado riesgo";
            }
        return sRespuesta;
    }
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