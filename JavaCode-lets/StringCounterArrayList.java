/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.semester2.y;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Purpose: 
 * @author 
 * Student Number: 
 * Date: 19/01/2026
 */

public class StringCounterArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Initiating Variables and Storage
        Scanner userInput = new Scanner(System.in);
        String userString = "";
        String tempString = "";
        char checkChar, tempChar;
        
        //Get user input
        System.out.println("Enter an alphabetic String");
        tempString = userInput.nextLine();
        System.out.print("Enter a single character to calculate amount of: ");
        tempChar = userInput.next().charAt(0);
        
        //Clean it up
        userString = tempString.toLowerCase();
        checkChar = Character.toLowerCase(tempChar);
        
        //Make new Arraylist then convert String to arrayList
        ArrayList<Character> chars = new ArrayList<Character>();
       
        for (char c : userString.toCharArray()) 
        {
        chars.add(c);
        }
        
        //Second AL that crosschecks char vs char array and retains only wanted char
        ArrayList<Character> searched = new ArrayList<Character>();
        searched.add(checkChar);
        chars.retainAll(searched);
 
        //spit out number of chars
        System.out.println("There is "+chars.size()+" of "+tempChar+" in String: " +tempString);
    }

}

