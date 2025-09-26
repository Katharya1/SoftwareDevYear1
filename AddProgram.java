/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.aaaa;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Purpose: 
 * @author 
 * Student Number: 
 * Date: 24/09/2025
 */
public class AddProgram {
        public static void main(String[] args) {
            
    Scanner addIntOne = new Scanner(System.in);  // Creates a Scanner object
    Scanner addIntTwo = new Scanner(System.in); 
    
    try {
    System.out.println("Enter First Integer"); // Read user input
    int firstNumber = addIntOne.nextInt();   // assigns Integer to Scanner Object
    
    System.out.println("Enter Second Integer");
    int secondNumber = addIntTwo.nextInt();  
    
    var sum = secondNumber + firstNumber; // adds both Integers
    
    System.out.println("Result = " + sum);  // Output user input
        } catch (InputMismatchException e) {
         System.out.println("Invalid input. Both inputs need to be Integers.");
    } finally {
         addIntOne.close();
         addIntTwo.close();  // Closes scanners to prevent resource leak
        }
    }
}
