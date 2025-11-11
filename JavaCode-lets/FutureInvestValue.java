package year1.prog1;
import java.util.Scanner;

/**
 * Purpose: Exercise 
 * @author 
 * Student Number: 
 * Date: 02/10/2025
 */
public class FinancialAppFutureInvestValue {
        public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        double userYears;
        double initialInvest, yearlyIntRate;
        
        System.out.println("Please enter Initial Investment Amount: ");
            initialInvest = userInput.nextDouble();
            
        System.out.println("Please enter Annual Interest Rate in Percentage: ");
            yearlyIntRate = userInput.nextDouble();
            
        System.out.println("Please number of Years: ");
            userYears = userInput.nextDouble();
            
        double monthRate = ((yearlyIntRate / 12.0) /100),
 //   System.out.println(monthRate); 
                    
               exponentCalc = (userYears * 12.0),
//   System.out.println(exponentCalc); 
                    
               calcOne = Math.pow((1.0+monthRate), exponentCalc),
 //   System.out.println(calcOne); 
 //     Experienced Calculation errors, sout's to find where Calc was off.
                    
               calcTwo = (initialInvest * calcOne);
            
        System.out.printf("Accumulated Value is : $%.2f", calcTwo);    
        }
    
}
