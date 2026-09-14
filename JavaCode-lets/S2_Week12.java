/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 * Purpose: Week 12 Exams
 * @author 
 * Student Number: 
 * Date: 20/04/2026
 */

class Book 
{
    
    //constructor with private arameters
    private String bookName;
    private String bookAuthor;
    
    //no parameters
    public Book() 
    {
    }
    //consctuor with parameters
    public Book(String theBookName, String theBookAuthor)
    {
        this.bookName=theBookName;
        this.bookAuthor=theBookAuthor;
    }
    //setter methods
    public void setBookName(String theBookName)
    {
        this.bookName=theBookName;
    }
    public void setAuthorName( String theBookAuthor)
    {
        this.bookAuthor=theBookAuthor;
    }
    
    //getter methods
    public String getBookName()
    {
        return this.bookName;
    }
    public String getAuthorName()
    {
        return this.bookAuthor;
    }
    
    //display details methods
    public String displayDetails()
    {
        String myString;
        myString ="\tTitle: "+this.bookName + "\t\tAuthor: "+bookAuthor;
        return myString;
    }    
    
}

public class S2_Week12 
{
    
    public static void main(String[] args) 
    {
        //Initialise Variables
        Scanner userInput = new Scanner(System.in);
                
        int counter;
        
        String userStringHolder="";
        
        //Program opening header + size of array
        System.out.println("Welcome to the book organization application!");
        System.out.printf("\nHow many books do you wish to input into the system?: ");
        counter = userInput.nextInt();
        
        Book[] bookArray = new Book[counter];
        
        userInput.nextLine(); //clear scanner cache
        System.out.println("\nPlease enter the following details of the books:");
        
        
        
        counter = 1; // counting books inputted
        for (int i=0; i < bookArray.length;i++)
        { // input for-loop
            bookArray[i] = new Book();
            System.out.printf("\nEnter title of Book [%d]: ",counter);
            userStringHolder = userInput.nextLine();
            bookArray[i].setBookName(userStringHolder);
            
            System.out.printf("Enter author of Book [%d]: ",counter);
            userStringHolder = userInput.nextLine();
            bookArray[i].setAuthorName(userStringHolder);
            counter++;
        }
        
        counter=1; //counting books outputted
        System.out.println("\n\nThe Books in our library include:");
        
        for (Book bookArray1 : bookArray) 
        { // output for-loop
            userStringHolder = counter + bookArray1.displayDetails();
            System.out.printf("\n"+userStringHolder);
            counter++;
        }
    }

}
