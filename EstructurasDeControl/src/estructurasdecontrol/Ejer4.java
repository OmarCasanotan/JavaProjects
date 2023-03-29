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
public class Ejer4 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        
        if (frase.substring(0,1).equalsIgnoreCase("A")){
            System.out.println("Correcto");
            
        }
        else {
            System.out.println("Incorrecto");
        }
    }
    
}
