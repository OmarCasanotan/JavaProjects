/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Win10 1909
 */
public class Extra6Elba {
//Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando, 
    //construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. 
    //Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria.
    //(Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9.
    //Finalmente imprima por pantalla la sopa de letras creada.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        String[][] matriz = new String[20][20];
        String palabra;
        Random random = new Random();
        int aleatorio,aleatorio2;
        //pide palabras y las ingresa a la matriz
        for (int i = 0; i < 5; i++) {
            aleatorio = random.nextInt(20);
            
            do {
                System.out.println("Ingresa una palabra de 3 a 5 caracteres");
                palabra = leer.next();
                aleatorio2=random.nextInt(20-palabra.length());
            } while (palabra.length() > 5 || palabra.length() < 3);

            for (int j = 0; j < palabra.length(); j++) {
                matriz[aleatorio][j+aleatorio2] = String.valueOf(palabra.charAt(j)) ;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == null  ) { 
                    matriz[i][j] =  String.valueOf(random.nextInt(10)) ;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
