/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdecontrol;

import java.util.Scanner;

/**
 *
 * @author Win10 1909
 */
public class EjerciciodeLaGuia9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numeros;
        int contador = 0;
        int sumador=0;
        do {

            System.out.println("Ingresar un numero ");
            numeros = leer.nextInt();
            contador++;

            if (numeros < 0)
            {
                continue;
            }
             
            sumador=sumador + numeros;
            if (numeros==0){
            System.out.println("Se capturo un cero");
            break;}

        } while (contador < 20);
        
        System.out.println( "La suma de los numeros es : " + sumador);
         
         
         
        
                    
                 
    }
}
