package IfStatements;
import java.util.Scanner;

/**
 * Purpose: 
 * @author 
 * Student Number: 
 * Date: 06/11/2025
 */
public class Lab6Act6A {


    /*Write a program (called Lab6Act6A.java) that asks the user to input an
integer between 1 and 7 inclusive. The program will then output to screen
solely information on whether the corresponding day is a ‘week day’ or
‘during the weekend’. Again, Monday is ‘Day 1’. The program should
also flag to the user when they input an integer outside the required range.
This program must use the ‘switch’ statement.*/
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int weekInt;
        int weekTestCase;
        
        System.out.println("Please enter an integer between 1 and 7. The system will then output if the day is during the week or during the weekend: ");
            weekInt = userInput.nextInt();
            
        weekTestCase = (weekInt<=5 && weekInt>0) ? weekTestCase=1 : ((weekInt>=6 && weekInt<8) ? 2:0);
            
        switch (weekTestCase) {
            
        
            case 1:
               System.out.println("It's a weekday! :(");
               break;

            case 2:
                System.out.println("It's the weekend! :)");
                break;
                
            case 0:
                System.out.println("Input Invalid, Please try again!");
                break;
    }
        
        
    }
    
}
