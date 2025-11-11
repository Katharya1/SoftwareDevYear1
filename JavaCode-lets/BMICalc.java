/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.aaaa;

import java.util.Scanner; 

/**
 * Purpose: Class Lab 1 Challenge
 * @author 
 * Student Number: 
 * Date: 25/09/2025
 */

public class BMICalc {
  
    public static void main(String[] args) {
   
        //Initiate Values
        double inchHeight;
        double inchToMetric;
        double poundWeight;
        double poundToKg;
        
       Scanner heightScan = new Scanner(System.in);  // Create Scanner Object
       
       
    System.out.printf("Do you know your weight in KG/Metres? (Y/N) "); // Check if conversion is needed
    String knowWeight = heightScan.nextLine();
       
    switch (knowWeight){ // switch if needed
        case "y":
        case "Y":    
         System.out.printf("Enter Height in Metres: ");
        inchToMetric = heightScan.nextDouble();  

     System.out.printf("Enter Weight in Kilograms: "); // Input for Metric
        poundToKg = heightScan.nextDouble(); 
        heightScan.close();
        
      var bmi = (poundToKg / (inchToMetric * inchToMetric));
      System.out.printf("BMI: %.2f", bmi); // calc
        break;
      
    case "N":
    case "n":
     System.out.printf("Enter Height in Inches: ");
        inchHeight = heightScan.nextDouble();  

     System.out.printf("Enter Weight in Pounds: ");
        poundWeight = heightScan.nextDouble();  // Input for Imperial
        heightScan.close();
  
    poundToKg = (poundWeight * 0.45359237);
    inchToMetric = (inchHeight * 0.0254);
        var bmi2 = (poundToKg / (inchToMetric * inchToMetric)); // Calc
        
        
        System.out.printf("BMI: %.2f", bmi2);
        break;
        
    default :
        System.out.println("invalid choice")   ;
             break; // If user does not use Y/N
    }
    }
}
    
