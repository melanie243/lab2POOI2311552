/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pc;

import java.util.Scanner;

/**
 *
 * @author melanieserpa
 */
public class PC {

    /**
     * @param args the command line arguments
     */
    
        public static void main(String[] argh)  
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese un número a evaluar: "); //El número que será evaluadoPC
           
        
            long x = 0;
        try{
            x = sc.nextLong();
            //System.out.println(x + " se puede almacenar en:");
            if (x < 129 && x > -129){
                System.out.println(x + " se puede almacenar en tipo de dato Byte");
            }
            
            if (x < 32769 && x > -32768){
                System.out.println(x + " se puede almacenar en tipo de dato Short");
            }
            
            if (x < 2147483648L && x > -2147483649L){
                System.out.println(x + " se puede almacenar en tipo de dato Int");
            }
            
            if (x <= 9223372036854775807L && x >= -9223372036854775808L){
                System.out.println(x + " se puede almacenar en tipo de dato Long");
            }
        }
        catch(Exception e){
            System.out.println(x + " no puede ser almacenado en ningun lado");
        }
    }
    }
    
        
   

   
    