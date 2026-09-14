/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.semester2.y;
import java.util.Scanner;

/**
 * Purpose: Programming 2 Week 9 exam
 * @author
 * Student Number: 
 * Date: 18/03/2026
 */

public class S2_Week9 {

    public static void main(String[] args) {
        
        //Initiliase Variables
        String builderString = "";
        String inputString = "notend";
        String checkString = "";
        String[] myStringArray;
        String breakLine = "-----"; // build break line quickly
            for (int i=0;i<4;i++){
                breakLine = breakLine+breakLine;
            }
        
        int inputCounter=0;
        int vowelCounter=0;
        int vowelCompare=0;
        
        
        Scanner userInput = new Scanner(System.in);
        
        //Program Header and inform user
        System.out.println("""
                           This program searches for a string with the most vowels
                           and the number of vowels present in the String.
                           It then outputs the result of the last one that fits the required criteria.
                           Input a single word and press 'Enter' after each one.\n
                           """);
        System.out.println(breakLine);
        
        //Input While loop
        while (inputString.compareToIgnoreCase("end")!=0) 
        {
            System.out.printf("\nEnter String #%d: ",inputCounter);
            inputString = userInput.next();
                if(inputString.compareToIgnoreCase("end")==0)
                {
                    System.out.println("\nThanks for using the program! Results to follow!");
                    System.out.println(breakLine+"\n");
                    break;
                }
            builderString = inputString + " " + builderString; 
            inputCounter++;
        } // end of While Loop
        
        //buildArray
        myStringArray = builderString.split(" ");
        
        //Search Array and output resuly
        for (int i=myStringArray.length-1; i>=0;i--) 
        {
            checkString = myStringArray[i];
            if(checkString.length() < 3){continue;} //if less than 3, skip
            vowelCounter = countVowels(checkString);
            
            if (vowelCounter>=vowelCompare) 
            {
                vowelCompare=vowelCounter;
                inputString = checkString;
            }
        }
        
        System.out.printf("\nThe last String with the most vowels is : \"%s\" with %d vowels present",inputString,vowelCompare);              
        
    } // end main method

    //Function to count the number of vowels in a given string
    public static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if ("AEIOUaeiou".indexOf(ch) != -1){
                count++;
            }
        }
    return count;
        
    } //End countVowels method
}

