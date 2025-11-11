package year1.prog1;
import java.util.Scanner;

/**
 * Purpose: Exercise - Calculate Speeds (m/s, km/h, mph)
 * @author 
 * Student Number: 
 * Date: 09/10/2025
 */
public class CalculateSpeeds {

    public static void main(String[] args) {

        int distanceM, hourInput, minuteInput, secondsInput;
        double meterSeconds, kmHour, milesHour, hour2Minutes, minute2Seconds;
        // Initialising all the variables
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.printf("Input Distance in Meters: ");
            distanceM = userInput.nextInt();
            
        System.out.printf("Input Hours of journey time: ");
            hourInput = userInput.nextInt();
            
        System.out.printf("Input Minutes of journey time: ");    
            minuteInput = userInput.nextInt();
            
        System.out.printf("Input Seconds of journey time: ");
            secondsInput = userInput.nextInt();
                userInput.close();
        //Assigning the variables values, based on User Input
            
            
        hour2Minutes = hourInput * 60;
        minute2Seconds = (minuteInput + hour2Minutes) * 60;
        //Converting all time to Total Seconds (minute2Seconds), makes maths easier.
        
            meterSeconds = distanceM / (secondsInput+minute2Seconds);
            kmHour = (distanceM / ((minute2Seconds/60)/60))/1000;
            milesHour = (distanceM / ((minute2Seconds/60)/60))/1609;
            
        //Speed Calculations first /60 for minutes, seconds /60 for hours and finally for /1000,/1609 for KM/Miles
            
        System.out.printf("Your speed in Meters/Second is: %.3f \n", meterSeconds);
        System.out.printf("Your speed in KM/h is: %.2f \n", kmHour);
        System.out.printf("Your speed in Miles/h is: %.2f \n", milesHour);
        //Output Result
            
        
    }
    
}
