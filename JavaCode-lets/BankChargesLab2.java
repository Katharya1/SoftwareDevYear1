package IfStatements;
import java.util.Scanner;

/**
 * Purpose: 
 * @author 
 * Student Number: 
 * Date: 05/11/2025
 */

public class SwitchInfo {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        double newBankBalance, //Initiating all the variables at the start
               bankBalance,
               interestGained;
        
        int testCase = 0;
        
        System.out.print("Please Enter your Bank Balance: ");
            bankBalance = userInput.nextDouble();
        userInput.close();
            
        if (bankBalance>=1000){
            testCase=1;
        }
        if (bankBalance>=200 && bankBalance<=999.99){
            testCase=2;
        }
        if (bankBalance>=0.01 && bankBalance<=199.99){
            testCase=3;
        }
        if (bankBalance<0){
            testCase=4;
        } //Checks which condition is true and applies Case number
    
    switch (testCase) { //TestCases below
        case 1:
            System.out.println("You're in the green! Interest added below!");
            newBankBalance = (bankBalance * 1.1);
            interestGained = (newBankBalance - bankBalance);
            System.out.printf("$%.2f has been added to your account!", interestGained);
            System.out.printf("\nNew Bank Balance: $%.2f", newBankBalance);
            break;
        
        case 2:
            System.out.println("You're in the green! Interest added below!");
            newBankBalance = (bankBalance * 1.05);
            interestGained = (newBankBalance - bankBalance);
            System.out.printf("$%.2f has been added to your account!", interestGained);
            System.out.printf("\nNew Bank Balance: $%.2f", newBankBalance);
            break;
            
        case 3:
            System.out.println("You're in the green! Interest added below!");
            newBankBalance = (bankBalance * 1.01);
            interestGained = (newBankBalance - bankBalance);
            System.out.printf("$%.2f has been added to your account!", interestGained);
            System.out.printf("\nNew Bank Balance: $%.2f", newBankBalance);
            break;
            
        case 4:
            System.out.println("You're in the red! :( \nOverdraft Added");
            newBankBalance = (bankBalance * 1.13);
            interestGained = (bankBalance - newBankBalance);
            System.out.printf("Penalty off $%.2f has been added to your account!", interestGained);
            System.out.printf("\nNew Bank Balance: $%.2f", newBankBalance);
            break;
            
        default:
            System.out.println("No Interest or Overdraft added");
            System.out.println("$"+bankBalance);
            break;
        }

    }

}
