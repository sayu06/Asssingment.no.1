/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


/**
 *
 * @author Sayali
 */
import java.util.Scanner;
public class SwappingNo {
    
   public static void main(String args[])
   {
       int temp;
       Scanner sc = new Scanner(System.in);
      
       System.out.println("Enter first number = ");
       int a = sc.nextInt();
       
       System.out.println("Enter second number = ");
       int b= sc.nextInt();
       temp = a;
       a = b;
       b = temp;
       
       System.out.println("After swapping first number ="+a);
     
       System.out.println("After swapping second number ="+b);
      
   }
}

