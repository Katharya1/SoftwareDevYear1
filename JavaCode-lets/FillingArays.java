/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.semester2.y;
import java.util.Scanner;

public class FillingArays {
    
            // dont think can make a class that also asks for size array in one call
            // think minimum two calls
    public static void inputDataIntoIntArray(int[] theArray) {
        
        //variables
        int index;
        int arraySize;
        Scanner userInput = new Scanner(System.in);
        
        arraySize = theArray.length;
        for (index = 0; index<arraySize; index++)
        {
            System.out.println("Enter an Integer: " +(index+1));
            theArray[index] = userInput.nextInt();
            System.out.println("");
        }
    }
    public static void inputDataIntoAlphaCharArray(char[] theArray)
        {
        
            //variables
        int index;
        int arraySize;
        String tempString;
        Scanner userInput = new Scanner(System.in);
        int ascIIConvert;

        //forloop to enter Chars
        arraySize = theArray.length;
        for (index = 0; index<arraySize; index++)
        {
            System.out.println("Enter a Char: " +(index+1));
            tempString = userInput.next();
                if (tempString.length()>1) //if to check if its a single char
                {
                    System.out.println("That was not a single char.");
                    index--;
                    continue;
                }
            ascIIConvert = (int)tempString.charAt(0); //cast into int
            boolean isAlphaChar = (ascIIConvert >= 65 && ascIIConvert <= 90) || 
                    (ascIIConvert >= 97 && ascIIConvert <= 122); // check if between ranges
                if(isAlphaChar) //check if A-Z or a-z
                {
                theArray[index] = tempString.charAt(0);
                System.out.println("");   
                }
                else
                {
                    System.out.println("That was not an alphabetic Char.");
                    index--;
                }

            }
        }
    public static void inputDataIntoStringArray(String[] theArray) {
        
        int index;
        int arraySize;
        Scanner userInput = new Scanner(System.in);
        
        arraySize = theArray.length;
        for (index = 0; index<arraySize; index++)
        {
            System.out.println("Enter a single String: " +(index+1));
            theArray[index] = userInput.next();
            System.out.println("");
        }
        
    } // end of method to input integers
        
}
