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
public class EjerciciodeLaGuia10 {
    //Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//5 *****
//3 ***
//11 ***********
//2 **

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        String asteriscos;
        
        for (int i = 0; i < 4; i++) {
            asteriscos = " ";
            System.out.println("Ingrese numeros del 1 al 20");
            numero = leer.nextInt();
            while (numero>20){
            System.out.println("numero invalido, ingrese otro");
            numero = leer.nextInt();
        }
            
            for (int k = 0; k < numero; k++) {
                asteriscos=asteriscos+"*";
                
            }
            System.out.println(numero + asteriscos);
            
        }

    }
}
