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
public class FindEvenOdd 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer =");
        int num = sc.nextInt();
        if(num % 2 == 0)
        {
            System.out.println("Integer is even !!!");
        }
        else 
        {
            System.out.println("Integer is odd !!!");
        }
    }
}
/*Program to check number is even or odd. */