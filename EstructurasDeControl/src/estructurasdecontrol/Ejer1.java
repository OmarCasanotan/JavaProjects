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
public class Ejer1 {
//Crear un programa que dado un número determine si es par o impar.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un numero ");
        num = leer.nextInt();
        if (num %2 ==0){
            System.out.println( num + " el numero es par");  
        }
           
        if (num %2 !=0){
             System.out.println(num + " el numero es impar");
        }
      
        
        
    }
     
}

