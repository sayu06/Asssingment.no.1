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
public class QuotientRemainder
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a divisior =");
        int a = sc.nextInt();
        System.out.println("Enter dividend =");
        int b = sc.nextInt();
        int div = b/a;
        System.out.println("Ouotient ="+div);
        int mod = b%a;
        System.out.println("Remainder = "+mod);
    }
}
/*Program to find quotient and remainder*/