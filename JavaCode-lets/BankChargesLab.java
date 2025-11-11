package IfStatements;
import  java.util.Scanner;

/**
 * Purpose: 
 * @author 
 * Student Number: 
 * Date: 03/11/2025
 */

public class BankChargeLab {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double newBankBalance,
               bankBalance;
        
        System.out.print("Please Enter your Bank Balance: ");
            bankBalance = userInput.nextDouble();
        
        if(bankBalance>=1000){
            System.out.println("You're in the green! Interest added below!");
            newBankBalance = (bankBalance * 1.1);
            System.out.printf("New Bank Balance: %.2f", newBankBalance);
            
        } else if (bankBalance>=200 && bankBalance<=999.99){
            System.out.println("You're in the green! Interest added below!");
            newBankBalance = (bankBalance * 1.05);
            System.out.printf("New Bank Balance: %.2f", newBankBalance);
            
        } else if (bankBalance>=0.01 && bankBalance<=199.99){
            System.out.println("You're in the green! Interest added below!");
            newBankBalance = (bankBalance * 1.01);
            System.out.printf("New Bank Balance: %.2f", newBankBalance);
            
        } else if (bankBalance<0){
            System.out.println("You're in the red! :( \nOverdraft Added");
            newBankBalance = (bankBalance * 1.13);
            System.out.printf("New Bank Balance: %.2f", newBankBalance);
            
        } else {
            System.out.println("No Interest or Overdraft added");
            System.out.println(bankBalance);
        }

    }

}
