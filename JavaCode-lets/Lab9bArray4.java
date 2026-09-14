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
public class Lab9bArray4 {

    /**
     * 
     * write a program that sets up a character array, restricted to alphabetic characters, 
     * that takes in 10 entries and ensures, when being entered that they are placed 
     * in alphabetic order
     * @param args 
     */
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        //Initialise Variables
        Scanner userInput = new Scanner(System.in);
        
        int[] userIntArray = new int[11];
        
        char continueCheck='y';
        
        String stringInputHolder;
        
        Boolean correctInput = true;
        
        int Counter;
        int Place = 0;
        int noOfElements = 0;
        int intHolder;
        int deleteCounter;
        int intToDelete;
        
        //user Info
        System.out.println("Enter 10 total integers. Press Enter after each input.");
        
        for (int i=0; i<userIntArray.length-1; i++) 
        { // start of main for loop
            intHolder = userInput.nextInt();
            
            if (noOfElements == 0) // if 0, no check. Initialises the check
            {
                userIntArray[0] = intHolder;
                noOfElements++;
            }
            
            else
            { // start of main code
                Counter = 0;
                while ((Counter < noOfElements) && (intHolder < userIntArray[Counter]))
                    // Loop as many time as there is elements and as long as input char is greater than char checked against
                    {
                        Counter++;
                    }
                Place = Counter; // found the place it should be in
                
            // shuffle forloop
            for (Counter = noOfElements -1; Counter>=Place; Counter--) 
            {
             userIntArray[Counter+1] = userIntArray[Counter]; // shuffle everything forward from the place  
            }
            userIntArray[Place] = intHolder; // insert new char into place
            noOfElements++;
            }
            
            for (int e=0; e < noOfElements;e++) 
            { // start of print for loop
                
            System.out.print(userIntArray[e]+" ");
            } // end
            
            System.out.println(""); // spacer line
        }
        
        do 
        { // start of second loop to remove elements
        System.out.println("Do you wish to delete any element? Y/N");
        stringInputHolder = userInput.next();
        stringInputHolder = stringInputHolder.toLowerCase();
        continueCheck = stringInputHolder.charAt(0); // clean up input
        if (continueCheck == 'n') 
        {
            System.out.println("Thank you, good bye.");
            System.exit(0);
        }
        else if (continueCheck == 'y')
        {
            System.out.println("How many elements do you wish to delete?"); 
            deleteCounter = userInput.nextInt();
            while(deleteCounter!=0)
            { // delete as many times as asked loop
                System.out.println("\nWhich element do you wish to delete?");
                intToDelete = userInput.nextInt();
                Counter = 0;
                while ((Counter < noOfElements) && intToDelete!=userIntArray[Counter]) // search for int needed
                {
                    Counter++;
                }
                if (Counter < noOfElements) {Place = Counter;} // found its place
                else {Place = -1;} // found no place
                if (Place != -1) // if not -1, begin the shuffling
                {
                for (Counter = Place; Counter<noOfElements-1; Counter++) 
                {
                    userIntArray[Counter] = userIntArray[Counter+1]; // shuffle everything forward from the place  
                }
                userIntArray[noOfElements-1] = 0; // insert new int into place
                noOfElements--;
                }
                else
                {
                System.out.println("Number does not exist in Array");
                }
             deleteCounter--;
             correctInput=true;
            } // end of loop to delete entry
        }

        else
        {
            System.out.println("Wrong Input"); // catch if not 'n' or 'y'
            correctInput=false;
        }
        }
        while(correctInput==false); // if input is invalid, loop till valid
        
        if (correctInput) 
        {
        System.out.println("\nUpdated Array");
        
        for (int i=0; i < noOfElements;i++) 
            { // start of print for loop
                
            System.out.print(userIntArray[i]+" ");
            } // end
        } // end of print if
    } // end of main class
}


