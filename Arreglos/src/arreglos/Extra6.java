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
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] palabras = new String[5];

        // Pedir al usuario que ingrese las 5 palabras
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Ingrese la palabra " + (i + 1) + " (de 3 a 5 caracteres): ");
            palabras[i] = leer.nextLine();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 caracteres.");
                System.out.print("Ingrese la palabra " + (i + 1) + " (de 3 a 5 caracteres): ");
                palabras[i] = leer.nextLine();
            }
        }

        // Elegir una fila aleatoria para ubicar las palabras
        int fila = (int) (Math.random() * 19);

        // Construir la sopa de letras
        char[][] sopa = new char[20][20];
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa.length; j++) {
                if (i == fila) {
                    // Si estamos en la fila elegida, intentar ubicar las palabras horizontalmente
                    boolean ubicada = false;
                    for (int k = 0; k < palabras.length; k++) {
                        String palabra = palabras[k];
                        if (palabra != null && palabra.length() < sopa.length) {
                            boolean cabe = true;
                            for (int l = 0; l < palabra.length(); l++) {
                                if ( sopa[i][j + l] != palabra.charAt(l)) {
                                    cabe = false;
                                    break;
                                }
                            }
                            if (cabe) {
                                // Si cabe la palabra, ubicarla en la sopa
                                for (int l = 0; l < palabra.length(); l++) {
                                    sopa[i][j + l] = palabra.charAt(l);
                                    
                                }
                                palabras[k] = null; // Marcar la palabra como ubicada
                                ubicada = true;
                                break;
                            }
                        }
                    }
                    if (!ubicada) {
                        // Si no se pudo ubicar ninguna palabra, rellenar con un número aleatorio
                        sopa[i][j] = (char) ((int) (Math.random() * 10) + '0');
//                        Integer.toString(i); //para pasar numeros a cadenas de caracteres
                    }
                } else {
                    // Si no estamos en la fila elegida, rellenar con un número aleatorio
                    sopa[i][j] = (char) ((int) (Math.random() * 10) + '0');
                }
            }
        }

        // Imprimir la sopa de letras
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}
