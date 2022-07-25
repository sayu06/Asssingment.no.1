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
public class CheckLeapYear {
    public static void main(String args[])
    {
        boolean leap = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year =");
        int year = sc.nextInt();
        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                {
                    leap = true;
                }
                else
                {
                    leap = false;
                }
            }
            else
            {
                leap = true;
            }
        }
        else
        {
            leap = false;
        }
        if(leap)
            System.out.println("this is leap year ");
        else
            System.out.println("this year is not leap year");
    }
}
