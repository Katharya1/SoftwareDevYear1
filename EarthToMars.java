/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project.aaaa;

/**
 * Purpose: 
 * @author Katharya
 * Student Number: 
 * Date: 1/10/2025
 */

/**
 * At its closest point Earth -> Mars is 34,000,000 miles away
 * Delay of radio signal is = 186,000 miles per second.
 * Compute delay by dividing distance by speed of life
 * Display in seconds + minutes + seconds
 * 
 */
public class EarthToMars {
    
   public static void main(String[] args) {
       int distance = 34_000_000, radioSpeed=186_000;
       double delay = (distance/radioSpeed), delayS = (delay%60.0), delayM = (delay/60);
       
       System.out.printf("Delay in overall seconds: %.1f", delay);
       System.out.println("");
       System.out.printf("Delay in Minutes %.0f and Seconds: %.1f",delayM, delayS);
   }
    
}
