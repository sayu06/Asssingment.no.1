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
public class LCMbyHCF {
    public static void main(String args[])
    {
        int hcf=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number = ");
        int a = sc.nextInt();
        System.out.println("Enter second number = ");
        int b = sc.nextInt();
        for(int i=1;i<=a||i<=b;i++)
        {
            if(a%i==0 && b%i==0)
            hcf = i;
        }
        int lcm = (a * b)/hcf;
        System.out.println("lcm of given below = " +lcm);
    }
}
