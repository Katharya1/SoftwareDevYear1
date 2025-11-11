package ifLab;
import java.util.Scanner;

/**
 * Purpose: 
 * @author 
 * Student Number: 
 * Date: 23/10/2025
 */
public class Iflab7 {
 
    /** Write two versions of program, one using many else and one without else
     * user has to enter 3 different numbers
     * gives user numbers in ascending order - lowest - middle - highest
     * @param args 
     */
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        double a,
               b,
               c;
        
        System.out.println("You will be asked to enter 3 different numbers and they will be Re-Ordered into ascending order!");
        System.out.printf("Enter your First Number: ");
            a = userInput.nextDouble();

        System.out.printf("Enter your Second Number: ");
            b = userInput.nextDouble();

        System.out.printf("Enter your Third Number: ");
            c = userInput.nextDouble();
        
        System.out.println("Reordering...");    
        
        if (a>b && a>c && b > c ) {
            System.out.println("Your numbers are ready!");
            System.out.println("They are: " + c + " | " + b + " | " + a); // A is biggest, B is middle, C is smallest.
            System.out.println("These numbers were provided by Else Statements");
        }
        else if (a>b && a>c && b < c ) {              
            System.out.println("Your numbers are ready!");
            System.out.println("They are: " + b + " | " + c + " | " + a); // A is biggest, C is middle, B is smallest.
            System.out.println("These numbers were provided by Else Statements");            
        }
        else if (a<b && a>c && b > c ) {              
            System.out.println("Your numbers are ready!");
            System.out.println("They are: " + c + " | " + a + " | " + b); // B is biggest, A is middle, C is smallest.
            System.out.println("These numbers were provided by Else Statements");            
        }
        else if (a<b && a<c && b > c ) {              
            System.out.println("Your numbers are ready!");
            System.out.println("They are: " + a + " | " + c + " | " + b); // B is biggest, C is middle, A is smallest.
            System.out.println("These numbers were provided by Else Statements");            
        }
        else if (a<b && a<c && b < c ) {              
            System.out.println("Your numbers are ready!");
            System.out.println("They are: " + a + " | " + b + " | " + c); // C is biggest, B is middle, A is smallest.
            System.out.println("These numbers were provided by Else Statements");            
        }
        else if (a>b && a<c && b < c ) {              
            System.out.println("Your numbers are ready!");
            System.out.println("They are: " + b + " | " + a + " | " + c); // C is biggest, A is middle, B is smallest.
            System.out.println("These numbers were provided by Else Statements");            
        }
        else {
            System.out.println("Invalid Input");
        }
        var lowNum = (a<b) ? (a < c ? a : c) : (b<c ? b:c);
            System.out.println(lowNum + " is the First number in ascending order");
        
        var medNum = (a>b) ? (a < c ? a : (c>b? c:b)) : (b>c ? (b<c ? b:c):(c>a? c:a));
            System.out.println(medNum + " is the Second number in ascending order");
        
        var highNum = (a>b) ? (a > c ? a : c) : (b>c ? b:c);
            System.out.println(highNum + " is the Third number in ascending order");
    }
    
}
