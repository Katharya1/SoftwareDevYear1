package Exercise20;
import java.util.Scanner;

/**
 * Purpose: Practice Lab
 * @author Katharya
 * Student Number: 
 * Date: 13/11/2025
 */
public class MovieTicket {
    /**
     * @param args
     **/
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        int ageTicket,
            quantityTicket,
            priceTickets,
            totalPrice = 0;
        
        String dayType; 
                
        boolean moarTicketBool=true,
                correctDayType=false;
        
        String moarTicket;
         // All variables initialised
         
        System.out.print("""
                           Ticket Cost Calculator
                           ---------------------- """ + 
                           "\nDo you wish to purchase tickets? (yes/no): ");
            moarTicket = userInput.next();
            if (moarTicketBool = (moarTicket.equalsIgnoreCase("yes"))) { //if true do LOOP

        do {
            {
                System.out.print("Enter day type (weekday/weekend): ");
                dayType = userInput.next();
                
                if (correctDayType = (dayType.equalsIgnoreCase("weekend" ))) { // Checks if input is valid
                ;
                } else if (correctDayType = (dayType.equalsIgnoreCase("weekday" ))) { //Second Check, def better ways
                ;   
                } else if (correctDayType == false){ //if not as above, program exits
                        System.out.println("Invalid Input");
                            System.exit(0);
                        }

                               
                    
                System.out.print("Please enter age: ");
                 ageTicket = userInput.nextInt(); 
                    if (ageTicket < 0) { //if number negative program exits
                        System.out.println("Invalid Input");
                            System.exit(0); }
                            
                System.out.print("Please enter number of tickets you wish to purchase: ");
                 quantityTicket = userInput.nextInt();
                    if (quantityTicket <= 0) { //if negative program exits
                        System.out.println("Invalid Input");
                            System.exit(0); }
                
        if ("weekday".equalsIgnoreCase(dayType)) { //DayType has the least options, so its chosen as the first branch
            if (ageTicket>=0 && ageTicket<=12){
                    priceTickets = (quantityTicket * 8);
                    totalPrice += priceTickets; //If customer decides to continue, add price to the total
                System.out.println("\nYour Current Total is: $" + totalPrice);

                
            } else if (ageTicket>=13 && ageTicket<=59){
                    priceTickets = (quantityTicket * 12);
                    totalPrice += priceTickets;
                System.out.println("\nYour Current Total is: $" + totalPrice);
                
                
            } else { 
                    priceTickets = (quantityTicket * 6); // dont have to check if age above 60
                    totalPrice += priceTickets;
                System.out.println("\nYour Current Total is: $" + totalPrice);
                
            }   
                } //end of Weekday
        
        else if ("weekend".equalsIgnoreCase(dayType)) {
            if (ageTicket>=0 && ageTicket<=12){
                    priceTickets = (quantityTicket * 10);
                    totalPrice += priceTickets;
                System.out.println("\nYour Current Total is: $" + totalPrice);
                
                
            } else if (ageTicket>=13 && ageTicket<=59){
                    priceTickets = (quantityTicket * 15);
                    totalPrice += priceTickets;
                System.out.println("\nYour Current Total is: $" + totalPrice);
                
            } else {
                priceTickets = (quantityTicket * 8);
                    totalPrice += priceTickets;
                System.out.println("\nYour Current Total is: $" + totalPrice);
                
            }   
                } // end of weekend
                    }
                userInput.nextLine(); // Necessary otherwise skips more inputs | Clears scanner buffer
                    System.out.print("Do you wish to purchase more tickets? (yes/no): ");
                        moarTicket = userInput.nextLine();
                        moarTicketBool = (moarTicket.equalsIgnoreCase("yes")); 
                        System.out.println("");
                
                 if (moarTicketBool == false) { // no = false
                     System.out.println("Thanks for using our service!\nPlease Come again!");
                        System.exit(0);
                 }       

        }
        while (moarTicketBool == true); 
        
     } else {
        System.out.println("Thanks for using our service!\nPlease Come again!");
            userInput.close();
            System.exit(0);
                
            }

    }
    
}
