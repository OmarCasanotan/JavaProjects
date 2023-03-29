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
public class Extra1 {
//Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int minutos,horas,dias;
        System.out.println("Ingrese un tiempo en minutos");
        minutos=leer.nextInt();
        
        horas=minutos/60;   
        dias=horas/24;
        horas=horas%24;
        
        
        
        
        
        
        System.out.println( minutos + " minutos es equivalente a " + dias + " dia/s " + horas + " horas ");
    }
    
}
