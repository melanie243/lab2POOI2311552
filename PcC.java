/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pc.c;

import java.util.Scanner;

/**
 *
 * @author melanieserpa
 */
public class PcC {

    /**
     * @param args the command line arguments
     */

        
        public static void main(String[] args) {
        double nuevosalario,aumento = 0;
        Scanner sc =new Scanner (System.in);
        System.out.println("ingrese la calificacion 1=excelente, 2=bueno y 3=malo" );
        int calificacion= sc.nextInt();
        System.out.println("ingrese salario" );
        double salario = sc.nextDouble();
        
        
      if (calificacion==1) 
          aumento=salario*0.06;
     else if (calificacion==2)  
          aumento=salario*0.04;
     else if (calificacion==3)  
          aumento=salario*0.015;
      
      
      nuevosalario =aumento+salario;
      System.out.println("tiene un aumento de : "+aumento );
      System.out.println("su nuevo salario es : "+nuevosalario );
      
    }
    
    
    
    
}

