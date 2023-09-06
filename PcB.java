/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pc.b;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import java.util.Scanner;

/**
 *
 * @author melanieserpa
 */
public class PcB {

    /**
     * @param args the command line arguments
     */
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       
        int n = scanner.nextInt(); 
        scanner.skip("(\r\n|[\n\r\\u2029\u0085])?");
        if (n % 2 != 0){
            System.out.println("Luna");
        }
        else if (n % 2 == 0 && n > 1 && n < 6){
            System.out.println("Sol");
        }
        else if (n % 2 == 0 && n > 5 && n < 21){
            System.out.println("Sol");
        }
        else if (n % 2 == 0 && n > 20){
            System.out.println("Galaxia");
        }
        scanner.close();
        
    }
    
}
