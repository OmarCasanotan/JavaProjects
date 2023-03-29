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
public class Ejer8 {
//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño que desee para el cuadrado ");
        int n=leer.nextInt();
        
        //Linea superior
        for (int i=0; i < n; i++) {
            System.out.print("*");          
        }
        System.out.println();
        
        //Centro de la forma
          for (int i=0; i < n-2; i++) {
            System.out.print("*");
            for (int j=0;j< n-2;j++){
                System.out.print(" ");
                
            }
              System.out.println("*");
                      
        }
        
        
          for (int i=0; i < n; i++) {
            System.out.print("*");
                      
        }
        
    }
    
}
