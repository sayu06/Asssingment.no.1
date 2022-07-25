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
public class Ascii 
{
    public static void main(String[] args) 
    {

        char ch = 'b';
        int ascii = ch;
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}

//Java Program to Find ASCII Value of a Character


/*casting is used in this code .
  casting means one dataype to convert another datatype.
  so here char datatype ch variable cobert into int datatype variable castascii (int castascii = (int) ch)

  so we can covert many data type like (long castascii = (int) ch)
*/
