/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pc.d;

import java.util.Scanner;

/**
 *
 * @author melanieserpa
 */
public class PcD {

    /**
     * @param args the command line arguments
     */
        
        public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("ingrese el año " );
        int año= sc.nextInt();
        
        
      if (año %12==0) 
          System.out.println("año del mono");
     else if (año %12==1)  
          System.out.println("año del gallo");
      else if (año %12==2)  
          System.out.println("año del perro");
      else if (año %12==3)  
          System.out.println("año del cerdo");
      else if (año %12==5)  
          System.out.println("año del rata");
      else if (año %12==6)  
          System.out.println("año del buey");
      else if (año %12==7)  
          System.out.println("año del tigre");
      else if (año %12==8)  
          System.out.println("año del conejo");
      else if (año %12==9)  
          System.out.println("año del dragon");
      else if (año %12==10)  
          System.out.println("año del serpiente");
      else if (año %12==11)  
          System.out.println("año del caballo");
    }   
    
}
