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
public class Extra3 {
//Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra;
        
        System.out.println("Ingrese una letra para saber si es o no vocal");
        letra = leer.nextLine();
        
        if (letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")|| letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")) {
            System.out.println("Su letra es vocal");
        } else {
            System.out.println("Su letra no es vocal");
        }

    }

}
