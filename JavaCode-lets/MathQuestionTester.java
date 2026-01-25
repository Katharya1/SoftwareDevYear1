package com.mycompany.example;
import java.util.Scanner;

/**
 * Purpose: 
 * @author Katharya
 * Student Number: 
 * Date: 27/11/2025
 */

public class MathQuestionTester {

    public static void main(String[] args) {

        final int CORRECTINT = 2;
              int userNumber = 0;
              int i=3;
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("You will be asked a math question, answer truthfully...");
        System.out.println("You only have 3 attempts...");
        
        
        do {
            if (i >1)
            {
            System.out.println("");
            System.out.print("What is one plus one?: ");
            userNumber = userInput.nextInt();
            } 
            if (i ==1) 
            {
              System.out.println("");
              System.out.println("Once again, what is one plus one?");
              userNumber = userInput.nextInt();
            }
            
            
            if (userNumber != CORRECTINT) 
            {
            i--;
            System.out.println("Wrong Number!");
                if (i!=0) 
                {
                System.out.printf("Try again! You have %d attempts left!",i);
                System.out.println("");
                }
                
            } // if end 
            
        } while (userNumber != CORRECTINT && i!=0); // end do/while
        
        
        if (i==0) 
        {
            System.out.println("");
            System.out.println("Answer Incorrect.");
            System.out.println("You've used all your attempts...");
        }
        else 
        {                 
            System.out.println("");
            System.out.println("Correct!!");
            System.out.printf("You got it with %d attempts left!",i);
            System.out.println("\nYou are finished and free to go.");
            
        }
      
        }
    
}
