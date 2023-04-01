/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author Win10 1909
 */
public class Ej2 {
//Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector.
//El programa mostrará dónde se encuentra el numero y si se encuentra repetido

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tam = leer.nextInt();
        int[] vector = new int[tam];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100);  //esto hace numeros aleatorios
            System.out.println(vector[i]);

        }
        System.out.println("El numero a buscar será el 10");
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == 10) {
                contador = contador + 1;
            }

        }
        System.out.println("La cantidad de numeros 10 que hay es: " + contador);
         for (int i = 0; i < vector.length; i++) {
             if (tam==vector[i]) {
                 System.out.println("La posicion del numero obtenido es : " + i );
             }

        }
    }

}
