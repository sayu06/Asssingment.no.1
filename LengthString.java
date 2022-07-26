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
public class LengthString {  
public static void main(String args[]){  
String s1; 
Scanner sc = new Scanner (System.in);
System.out.println("Enter a string : ");
s1 = sc.next();
System.out.println("string length is: "+s1.length());
}
}

