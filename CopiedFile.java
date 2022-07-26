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
import java.io.*; 
public class CopiedFile {
    public static void main(String args[])throws IOException 
         { 
             FileOutputStream Fwrite;
        try (FileInputStream Fread = new FileInputStream("Hello.txt")) {
            Fwrite = new FileOutputStream("Hello1.txt");
            System.out.println("File is Copied");
            int c;
            while((c=Fread.read())!=-1)
                Fwrite.write((char)c); 
        }
               Fwrite.close(); 
          } 
 } 

