/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semester2.y;
import java.util.Scanner;

/**
 *
 * @author Katharya
 */
public class Lab9bExercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int index;
        int outerArrayIndex;
        int innerCharIndex;
        int spacesInArray;
        String nameArray[];
        Scanner userInput = new Scanner(System.in);
        
        //stting up the string array
        System.out.println("How many names do you want to put in to your Array: ");
        spacesInArray = userInput.nextInt();
        nameArray = new String[spacesInArray];
        
        //inputting strings in to the string array
        for (index = 0; index < nameArray.length; index++) {
            System.out.println("Enter a name into the String Array: ");
            nameArray[index] = userInput.next();
        }
        System.out.println();
        
        //The NESTED for loops - that is a for loop inside a for loop user to 
        // display all the characters in an arrray of strings on sperate Lines
        for (outerArrayIndex = 0; outerArrayIndex<nameArray.length; outerArrayIndex++) 
        {
            for (innerCharIndex = nameArray[outerArrayIndex].length(); innerCharIndex > 0; innerCharIndex--)
            {
                System.out.print(nameArray[outerArrayIndex].charAt(innerCharIndex-1));
            }
            System.out.println();
        }
    }
    
}
