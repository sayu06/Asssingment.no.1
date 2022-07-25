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
public class ConsonantVowel {
    public static void main(String args[]){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character =");
         char c = sc.next().charAt(0);
       
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
        {
            System.out.println("Chracter is consonant !!!");
        }
        else
        {
            System.out.println("Chracter is vowel !!!");
        }
    }
}
