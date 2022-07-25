/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Sayali
 */
import java.util.Scanner;
public class LargestNumber {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number = ");
        int a = sc.nextInt();
        System.out.println("Enter second number = ");
        int b = sc.nextInt();
        System.out.println("Enter third number = ");
        int c = sc.nextInt();
        if(a>b || a>c)
        {
            System.out.println("first nuber is largest !!!");
        }
        else if(b>c || b>c)
        {
            System.out.println("second nuber is largest !!!");
        }
        else
        {
            System.out.println("Third nuber is largest !!!");    
        }
     }
}
