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
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
              int num ;
      System.out.println(" ingrese un numero entre 1 y 10");
      num = leer.nextInt();
 if (num < 1 && num >10)
         System.out.println(" el numero es incorrecto ");
 

 switch (num){
     case 1: System.out.println("El numero en romano es I");
     break;
     case 2: System.out.println("El numero en romano es II");
     break;
     case 3: System.out.println("El numero en romano es III");
     break;
     case 4:  System.out.println("El numero en romano es IV");
     break;
     case 5:
 }
    }
    
}
