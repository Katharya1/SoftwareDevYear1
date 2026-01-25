package Exercise20;
import java.util.Scanner;

/**
 * Purpose: 
 * @author Katharya
 * Student Number: 
 * Date: 26/11/2025
 */

public class VoteCounter {

    public static void main(String[] args) {
        
        //Initialising Variables and scanner
        
        int numOfCandidates,
            voteStorage = 0,
            voteCompare = 0;
        
        String candidateStorage = "",
               candidateCompare = "";
        
        
        Scanner userInput = new Scanner(System.in);
        
        //Program Header
        System.out.println("""
                           Welcome to the totally trustworthy vote counter!
                           ------------------------------------------------""");
        
        System.out.print("Enter number of candidates: ");
            numOfCandidates = userInput.nextInt();
        
        //Start loop
    for (int i=1; i<=numOfCandidates; i++) {
        System.out.printf("Enter the name of candidate %d: ",i);
            candidateStorage = userInput.next();
            
        System.out.printf("Enter votes for %s: ",candidateStorage);
            voteStorage = userInput.nextInt();
            
            
        //Compare if new input is bigger. Store and switch
        if (voteStorage>voteCompare) { 
                voteCompare=voteStorage;
                candidateCompare=candidateStorage;
        }   //end if
        
        if (voteStorage==voteCompare) {
            candidateCompare = candidateCompare + " and " + candidateStorage;
        }    // end else if
        
    } // end loop
    
        System.out.printf("%s had the highest votes with a total of %d", candidateCompare,voteCompare);
    }

}
