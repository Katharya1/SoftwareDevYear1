/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.semester2.y;
import java.util.Scanner;

public class FillingAraysisEven {

    public static void inputDataIntoIntArray(int[] theArray) {
        
        int index;
        int arraySize;
        Scanner userInput = new Scanner(System.in);
        
        arraySize = theArray.length;
        for (index = 0; index<arraySize; index++)
        {
            System.out.println("Enter the Integer: " +(index+1));
            theArray[index] = userInput.nextInt();
            System.out.println("");
        }
        
    } // end of method to input integers
    
    public static void main(String[] args) {
        
        int myIntArray[];
        int numberOfEntries;
        int index;
        int noOfEven=0;
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("How many entries do you want in the Array? ");
        numberOfEntries = userInput.nextInt();
        System.out.println("");
        
        // code to invoke above method
        
        myIntArray = new int[numberOfEntries];
        
        inputDataIntoIntArray(myIntArray);
        
        for (index =0; index <numberOfEntries; index++)
        {
            System.out.println("Entry: "+(index+1)+" in your integer array is: "+myIntArray[index]);
            if(isEven.isEven(myIntArray[index]))
            {
                noOfEven++;
            }
        }
        System.out.println("");
        System.out.println("The number of even integers in your array is: "+noOfEven);
        System.out.println("");
        System.out.println("The number of odd integers in your array is: "+(numberOfEntries-noOfEven));
        System.out.println("");
    }

}
