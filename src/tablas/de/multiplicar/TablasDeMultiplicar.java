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
        
        int numero=1;
        int contadort=0;//Esta es para el numero por el que se multiplica
        int resultado;
    
        
        //Con un bucle FOR
        
      System.out.println("Tablas de multiplicar bucle for:");
        
        //Bucle para aumentar el numero de la tabla de multiplicar
        for( numero=1;numero<=10;numero ++){
            System.out.println("Tabla de multiplicar del " + numero);
                    //Bucle para aumentar el numero por el que se multiplica
                    for (contadort=1; contadort<=10;contadort ++){
                        resultado= contadort * numero;
                        System.out.println(numero + "x" + contadort+ "=" +resultado);
                    }
          }
        //Reiniciamos las variables que necesitamos
        contadort=0;
        numero=1;
           //Con un bucle while
           System.out.println("Tablas de multiplicar bucle while:");
      
        //Bucle para aumentar el numero de la tabla de multiplicar
        while(numero<=10){
            System.out.println("Tabla de multiplicar del " + numero);
                    //Bucle para aumentar el numero por el que se multiplica
                    while ( contadort<=10){
                        resultado= contadort * numero;
                        System.out.println(numero + "x" + contadort+ "=" +resultado);
                        contadort++;
                    }
                    
           contadort=0;//Se restablece el contador de la multiplicacion           
           numero++;
           
                }
         }
}

