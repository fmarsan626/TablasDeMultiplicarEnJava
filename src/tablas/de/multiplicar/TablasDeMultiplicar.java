/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas.de.multiplicar;

/**
 *
 * @author Francisco Marcos Sánchez <franmarcos91@gmail.com>
 */
public class TablasDeMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Tablas de multiplicar:");
        int numero=1;
        int contador ;//Esta variable es para la tabla de multiplicar
        int contadort;//Esta es para el numero por el que se multiplica
        int resultado;
        //Bucle para aumentar el numero de la tabla de multiplicar
        for( contador=1;contador<=10;contador ++){
            System.out.println("Tabla de multiplicar del " + numero);
                    //Bucle para aumentar el numero por el que se multiplica
                    for (contadort=1; contadort<=10;contadort ++){
                        resultado= contadort * numero;
                        System.out.println(numero + "x" + contadort+ "=" +resultado);
                    }
                      
                      numero++;
                            
        }
    }
    
}
