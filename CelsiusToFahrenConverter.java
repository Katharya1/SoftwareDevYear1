/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.aaaa;

import java.util.Scanner; 

/**
 * Purpose: 
 * @author 
 * Student Number: 
 * Date: 22/09/2025
 */

//class declaration
public class CelsiusToFahrenConverter {
    public static void main(String[] args) {
        
    Scanner celcTempt = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Degrees in Celsius");
    double celcTemp = celcTempt.nextDouble();  // Read user input
    
    double convertFahrenheit = ((celcTemp * 9.0/5) +32);
    System.out.println("Temperature in Fahrenheit: " + convertFahrenheit);  // Output user input
  }
}
