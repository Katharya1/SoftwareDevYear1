package year1.prog1;

import java.util.Scanner;

/**
 * Purpose: Exercise - Cost of Driving
 * @author 
 * Student Number: 
 * Date: 02/10/2025
 */

/** Pseudocode
 * Program prompts User for distance
 * Fuel Efficiency of car in MPG
 * Price per galon of fuel
 * Displays cost of trip
 */
public class CostOfDriving {

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Calculate in Imperial Or Metric?" ); // Check which system to use
        String systemUsed = userInput.nextLine();
  

    switch (systemUsed.toLowerCase()){
        case "imperial":
            double driveDistance, milesPG, costPG;
            
        System.out.println("Please enter Driving Distance in Miles: ");
            driveDistance = userInput.nextDouble();
            
        System.out.println("Please enter expected Miles Per Gallon: ");
            milesPG = userInput.nextDouble();
            
        System.out.println("Please enter Cost of Fuel per Gallon: ");
            costPG = userInput.nextDouble();
                userInput.close();
        
        double driveEff = (driveDistance / milesPG);
        double driveCost = (driveEff * costPG);
        
        System.out.printf("The cost of this Trip is: $%.2f", driveCost);        
            break;
            
        case "metric":
            double driveDistanceM, kiloMPL, costPL;
            
        System.out.println("Please enter Driving Distance in Kilometres: ");
            driveDistanceM = userInput.nextDouble();
            
        System.out.println("Please enter expected Litres /100km: ");
            kiloMPL = userInput.nextDouble();
            
        System.out.println("Please enter Cost of Fuel per Litre: ");
            costPL = userInput.nextDouble();
                userInput.close();
        
        double driveEffM = (kiloMPL * (driveDistanceM/100));
        double driveCostM = (driveEffM * costPL);
        
        System.out.printf("The cost of this Trip is: e%.2f", driveCostM);      
            
            break;
            
    default :
         System.out.println("invalid choice")   ;
            break; // If user does not use valid input
    }
    }
}
