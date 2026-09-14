/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.semester2.y;
import java.util.Scanner;

/**
 * Purpose: Write a java program that takes a character input
 * and determines whether it is a vowel or a consonant using
 * Character Class
 * @author 
 * Student Number: 
 * Date: 14/01/2026
 */

public class VowelChecker {

    public static void main(String[] args) {
        
        //initialise Variables
        Scanner userInput = new Scanner(System.in);
        
        String inputString;
        String ch;
        int stringSize = 0;
        double testNumeric;
        
        //User Query and set up for checks
        System.out.printf("Please enter a single alphabetic Character: ");
            inputString = userInput.nextLine();
            stringSize = inputString.length();
            ch = inputString.toLowerCase();
        
        //If Number - program closses. Otherwise continue.
        try {
            testNumeric = Double.parseDouble(inputString);
            if (testNumeric >= 0 || testNumeric <0) 
            {
            System.out.println("Input is not an alphabetic character. Program Closing.");
                System.exit(0);
            }
        } catch (NumberFormatException e) 
        {  
        // intentiolly left empty    
        }
        
        //Quick Size Check
        var stringCheck = (stringSize !=1 )? 1 : 2 ;

        //Main Switch
        switch (stringCheck) 
        {
            case 1:
                System.out.println("Input is not a single alphabetic character. Program Closing.");
                System.exit(0);
             break;
              
            // Secondary Switch 
            case 2:
                
                switch (ch)
                {
                    case "a","o","e","i","u":
                        System.out.println("Character '"+inputString+"' is a vowel");
                        break;
                        
                    default: 
                        System.out.println("Character '"+inputString+"' is not a vowel");
                        break;
                }
             break;
        }
        
    }

}
