/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.PrintStream;

/**
 *
 * @author Sayali
 */
public class LargestArray {
     public static void main(String[] args) {
        int[] numArray = { 4, 5, 0, 6, 7, 8, 9,2 };
        int largest = numArray[0];

        for (int num: numArray) {
            if(largest < num)
                largest = num;
        }

         System.out.format("Largest element = %d", +largest);
    }
}

