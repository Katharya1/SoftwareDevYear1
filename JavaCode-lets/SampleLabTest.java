/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.semester2.y;
import java.util.Scanner;

/**
 * Purpose: 
 * @author Norbert Jez
 * Student Number: 
 * Date: 18/09/2025
 */

public class SampleLabTest {

    public static void main(String[] args) {
        
        // Initialise all the variables
        Scanner userInput = new Scanner(System.in);
        int arrayLength = 0;
        int i = 0;
        String buildString = "";
        String tempString = "";
        String outputString = "";
        char testChar1;
        char testChar2;
        
        //output Program header and instructions
        System.out.println("This program will find strings with similar second"
                + "and second last characters. In pattern of xoxxox / xoox.");
        System.out.println("Each string has minimum length of 4 or else it won't be processed");
        System.out.println("Enter 'end' to end the program and search for matches.");
        System.out.println("---------------------------------------------------------");
        System.out.println("Enter strings to process!");
        
        //while loop to build a string to split into array after
        while (!buildString.equalsIgnoreCase("end"))
        {
            System.out.printf("String %d: ", arrayLength);
            buildString = userInput.next();
                //break program before it adds end to strings
                if (buildString.equalsIgnoreCase("end")) break; 
            arrayLength++;
            tempString = buildString + " " + tempString;
        }
        
        //split string into array
        String[] stringArray = tempString.split(" ");
        
        //process each element in array and check for rule match
        //clean up characters
        //build Output
        for (String checkString : stringArray) 
        {
            if (checkString.length()>3) 
            {
                testChar1 = checkString.charAt(1);
                testChar1 = Character.toLowerCase(testChar1);
                testChar2 = checkString.charAt(checkString.length()-2);
                testChar2 = Character.toLowerCase(testChar2);
                    if (Character.compare(testChar1, testChar2) == 0)
                    {
                        outputString = stringArray[i] + " " + outputString;
                    }
            }    
            i++; //if counter is in loop, always 0. Counter at top always.
        }
        
        System.out.println("The following words follow the set out pattern:");
        System.out.println(outputString);
    }

}
