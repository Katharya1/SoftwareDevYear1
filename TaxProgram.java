/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.aaaa;

import java.util.Scanner; 

/**
 * Purpose: Lab 2
 * @author 
 * Student Number: 
 * Date: 25/09/2025
 */
public class TaxProgram {
            public static void main(String[] args) {
                
    Scanner annualIncome = new Scanner(System.in);  // Create a Scanner 
    Scanner numKids = new Scanner(System.in); 
    
    System.out.printf("Insert Annual Income:");
        double taxIncome = annualIncome.nextDouble();  // Read user input
    System.out.printf("Insert Number of Children:");
        double taxKids = numKids.nextDouble();  
    
          double realTax = ((taxIncome * 0.24) - (5000 + (taxKids * 1000)));
    System.out.printf("Tax payment for the year: %.2f", realTax);// Output user input   
           
            }
    
}
