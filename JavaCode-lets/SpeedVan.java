/**
 * Purpose: Boolean + Ternary Operator
 * @author 
 * Student Number: 
 * Date: 18/09/2025
 */
public class SpeedVanExample {


    public static void main(String[] args) {
        //Program to model a speed van in action.
        //Declare and initialise our variables
        int speedInput = 130;
        int speedLimit = 80;
        
        // Determine if the vehicle is speeding
        // or not speeding so we can issue
        //a speeding ticket and fine
        
        boolean busted = (speedInput>speedLimit)? true : false;
        System.out.println("Issue penalty points: "+busted);
        
        String penalty = (speedInput>speedLimit)? "Issue fine" : "No fine";
        System.out.println("Issue penalty? " +penalty);
        
    }
    
}
