/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Sayali
 *
 * public class Main {
*/
import java.util.Scanner;
class FactorOfInteger
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        for (int i = 1; i <= number; ++i)
        {
            if (number % i == 0)
            {
                System.out.println("Factor of number "+i );
            }
        }
    }
}
