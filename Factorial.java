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
import java.util.*;
public class Factorial 
{
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter sny positive integer = ");
        int num=sc.nextInt();
        int  fact=1;
        for(int i=1;i<=num;i++)
        {
           fact = fact *i;        
        }
       System.out.println("Factorial of number = "+fact);
     }

}
/*Wrie a program to find the factorial value of any number entered thhrough the keyboard.*/
