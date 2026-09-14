/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semester2.y;
import java.util.Scanner;

/**
 *
 * @author Katharya
 */
public class footBallerUse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //initialise Variables
        Scanner userInput = new Scanner(System.in);
        
        String playerName;
        
        int scoredValue;
        int highestGoalTracker=0;
        int indexTracker=0;
       
        footBaller[] playerArray = new footBaller[5];
        
        footBaller temp;
        temp = new footBaller(); // to be used in sorting
        
        //get user player data
        System.out.println("Please insert the players below!");
        
        for (int i=0; i < 4;i++) 
        { // start of main data insert loop
        playerArray[i] = new footBaller();
        System.out.println("Please provide player information.");

        System.out.print("\nEnter player name: ");
        playerName = userInput.nextLine();
        playerArray[i].setName(playerName);

        
        System.out.printf("Enter goal scored for player %s: ",playerName);
        scoredValue = userInput.nextInt();
        playerArray[i].setGoalScored(scoredValue);
        
        System.out.printf("Enter points scored for player %s: ",playerName);
        scoredValue = userInput.nextInt();
        playerArray[i].setPointScored(scoredValue);
        
        System.out.println("\nAdding footballer to Array!\n");
        userInput.nextLine(); // clear scanner
        } // end of loop
        
        //sort loop
        for (int i = 0; i < playerArray.length - 1; i++) 
        {
            
        int maxIndex = i;
        
            for (int j = i + 1; j < playerArray.length-1; j++) 
            {
                if (playerArray[j].getTotalPoints() > playerArray[maxIndex].getTotalPoints()) 
                {
                    maxIndex = j;
                }
            }
        temp = playerArray[i]; // learnt that you need to make an empty object to insert and compare
        playerArray[i] = playerArray[maxIndex];
        playerArray[maxIndex] = temp;
        } //end of sort loop

        //print loop of all players
        for (int i=0; i<playerArray.length-1;i++) 
        {
            System.out.println(playerArray[i].toString());    
        }
        
        //print loop of highest score
        for (int i=0; i<playerArray.length-1;i++)
        {
            if (highestGoalTracker < playerArray[i].getGoalScored())
            {
                highestGoalTracker = playerArray[i].getGoalScored();
                indexTracker = i;
            }
        }
        
        System.out.println("\n----------------------------------------------\n");
        System.out.println("Player with the most Goals is!");
        
        System.out.println(playerArray[indexTracker]);
        
    } // end of main
    
} // end of class
