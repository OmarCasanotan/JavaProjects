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
public class Extra2 {
//Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
    //A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
    //Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       int A=10, B=5,C=7,D=8;
        System.out.println("Los valores iniciales son los siguientes: A= " + A+ " B= " + B + " C= " + C + " D= " + D);
        int aux = B;
        B=C;
        C=A;
        A=D;
        D=aux;
        
        System.out.println("Los valores retornados son: A= " +  A + " B= " + B + " C= " + C + " D= " + D );
                
     
           
       }            
    }
    




 //b=c;
      //c=a;
      //a=d;
      //d=b;
      //d=auxiliar;
       