/**
 * Purpose: Lab Test Prep
 * @author 
 * Student Number: I don't remember
 * Date: 10/11/2025
 */

public class HeightExerciseNov {
    
    
    public static void main(String[] args) {

    //Scanner Import
        Scanner userInput = new Scanner(System.in);
        
    //Initialise variables (need 10(2 for names, 4 for values, 2 for totals, 1 for height diff, 1 testcase))
        String inputName1,
               inputName2;
        
        float feetHeight_Name1,
              inchHeight_Name1,
              totalHeight_Name1;
        
        float feetHeight_Name2,
              inchHeight_Name2,
              totalHeight_Name2;
        
        float heightDiff;
        
        int   testcase;
            
        
    // Prompt User for names and heights
        System.out.println("""
                           You will be prompted to enter the following: Name, Feet and Inches 
                           For the program to calculate who's tallest and the difference in height.
                           """);
        
        System.out.print("Enter the name of person 1: ");
            inputName1 = userInput.next();
            
            System.out.printf("Enter height in Feet: ");
                feetHeight_Name1 = userInput.nextFloat();   
            System.out.printf("Enter height in Inches: ");
                inchHeight_Name1 = userInput.nextFloat();
                
            
        System.out.print("Enter the name of person 2: ");
            inputName2 = userInput.next();
            
            System.out.printf("Enter height in Feet: ");
                feetHeight_Name2 = userInput.nextFloat();   
            System.out.printf("Enter height in Inches: ");
                inchHeight_Name2 = userInput.nextFloat(); 
                
    // Getting the totals
        totalHeight_Name1 = (feetHeight_Name1 * 12) + inchHeight_Name1;
        totalHeight_Name2 = (feetHeight_Name2 * 12) + inchHeight_Name2;
            
    // Use if Else to check for same height
        if (totalHeight_Name1==totalHeight_Name2) {
            System.out.printf("At %.0f feet %.0f inches, %s and %s are the same height.", feetHeight_Name1, feetHeight_Name2, inputName1, inputName2);
            
    // Use ternary operator + switch + else for height check + set theory
        } else {
            
          
            var tallestHeight = (totalHeight_Name1>totalHeight_Name2)? 1 : 2 ;
            
    // This result in a lot of TECH DEBT. But i enjoy Ternary Operators :/       
    //Print result
        switch (tallestHeight) {
            case 1:
                    heightDiff = totalHeight_Name1 - totalHeight_Name2;
                    System.out.printf("At %.0f feet %.0f inches %s is the tallest by %.0f inches", feetHeight_Name1, inchHeight_Name1, inputName1, heightDiff);
                    break;
                    
            case 2:
                    heightDiff = totalHeight_Name2 - totalHeight_Name1;
                    System.out.printf("At %.0f feet %.0f inches %s is the tallest by %.0f inches", feetHeight_Name2, inchHeight_Name2, inputName2, heightDiff);
                    break;
            }
            
        }
            
            
        

        

    }

}
