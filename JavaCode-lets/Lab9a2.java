/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semester2.y;
import java.util.Scanner;

/**
 *
 * @author Katharya
 */
public class Lab9a2 {

    /**
     * 
     * write a program that sets up a character array, restricted to alphabetic characters, 
     * that takes in 10 entries and ensures, when being entered that they are placed 
     * in alphabetic order
     * @param args 
     */
    
    public static void main(String[] args) {
        
        //Initialise Variables
        Scanner userInput = new Scanner(System.in);
        
        char[] userCharArray = new char[11];
        char charHolder;
        
        String inputHolder = "";
        
        int Counter;
        int Place = 0;
        int noOfElements = 0;
        int charIntChecker = 0;
        int charIntCheckerOpposite = 0;
        
        
        //user Info
        System.out.println("Enter 10 total chars. Only alphabetic and one at time. Press Enter after each input.");
        System.out.println("If a string is inputed, only the first character will be counted.");
        
        for (int i=0; i<userCharArray.length-1; i++) 
        { // start of main for loop
            inputHolder = userInput.next();
            inputHolder = inputHolder.toLowerCase();
            charHolder = inputHolder.charAt(0); // clean up input
                
            if (!isAlpha(charHolder))  // check if alpha char
            {
                System.out.println("The character entered wasn't in the alphabet");
                i--;
                continue;
            }
            
            if (noOfElements == 0) // if 0, no check. Initialises the check
            {
                userCharArray[0] = charHolder;
                noOfElements++;
            }
            
            else
            { // start of main code
                Counter = 0;
                //char to int converts to compare via ASCII
                charIntChecker = toInt(charHolder); 
                charIntCheckerOpposite = toInt(userCharArray[Counter]); 
                while ((Counter < noOfElements) && (charIntChecker > charIntCheckerOpposite))
                    // Loop as many time as there is elements and as long as input char is greater than char checked against
                    {
                        Counter++;
                        charIntCheckerOpposite = toInt(userCharArray[Counter]); //update checking char value
                    }
                Place = Counter; // found the place it should be in
                
            // shuffle forloop
            for (Counter = noOfElements -1; Counter>=Place; Counter--) 
            {
             userCharArray[Counter+1] = userCharArray[Counter]; // shuffle everything forward from the place  
            }
            userCharArray[Place] = charHolder; // insert new char into place
            noOfElements++;
            }
            
            for (int e=0; e < noOfElements;e++) 
            { // start of print for loop
                
            System.out.print(userCharArray[e]+" ");
            } // end
            
            System.out.println(""); // spacer line
        }
}

        public static boolean isAlpha(char charToCheck) {
        //cast Char to Integer
        int ascIIConvert;
        ascIIConvert = charToCheck;
            
        //boolean check if char is between ASCII values of A-z
        boolean isAlphaChar = (ascIIConvert >= 65 && ascIIConvert <= 90) || 
                    (ascIIConvert >= 97 && ascIIConvert <= 122);
            
        return isAlphaChar;
        } // end of isAlpha method
        
        
        public static int toInt(char charToConvert) {
        //cast Char to Integer
        int ascIIConvert;
        ascIIConvert = charToConvert;
            
        return ascIIConvert;
        } // end of toInt method
}


