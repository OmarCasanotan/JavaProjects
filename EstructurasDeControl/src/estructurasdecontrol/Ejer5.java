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
public class Ejer5 {
//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite;
        int suma=0;
        System.out.println("Ingrese un numero para el limite");
       limite = leer.nextInt();
       
       do {
           System.out.println("Ingrese un numero");
           suma = suma + leer.nextInt();
           
       }while(limite >= suma);
        System.out.println("El programa termino porque el limite " + limite + " fue superado por la suma " + suma);
        
              
     
      
    }
    
}
