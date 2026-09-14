/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.semester2.y;
import java.util.Scanner;

/**
 * Purpose: Reverse String and display the reversed String
 * @author 
 * Student Number: 
 * Date: 18/09/2025
 */

public class ReverseString {

    public static void main(String[] args) {
        
        // Variables
        String userString; 
        String reverseString = "";
        
        int stringLength = 0;
        int charPointer=0;
        
        char reverseChar;
        
        Scanner userInput = new Scanner(System.in);
        
        // Get Length
        System.out.println("Enter a String to reverse");
        userString = userInput.nextLine();
        
        stringLength = userString.length();
        
        // Loop Through Characters and reverse
        charPointer = stringLength-1;
        
        for (int i=0; i<stringLength;i++) 
        {
            reverseChar = userString.charAt(charPointer);
            reverseString = reverseString + reverseChar;
            if (charPointer!=0)
            {
                charPointer--;
            }
        }
        System.out.println("Reverse String is: "+reverseString);
    }

}
