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
public class EjerciciodeLaGuia7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int motor;
        System.out.println("Ingrese una opcion");
        motor = leer.nextInt();
        switch (motor) {
            case 1:
                System.out.println("La bomba es de agua");
                break;
            case 2:
                System.out.println("La bomba es de gasolina");
                break;
            case 3:
                System.out.println("La bomba es de hormigon");
                break;
            case 4:
                System.out.println("La bomba es de pasta alimenticia");
            default:
                System.out.println("El valor ingresado no corresponde a una opcion");
                       
        }
       
        
    }
}
