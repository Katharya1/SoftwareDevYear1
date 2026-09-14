/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.semester2.y;
import java.util.Scanner;

/**
 * Purpose: 
 * @author 
 * Student Number: 
 * Date: 18/09/2025
 */


public class MultiplicationTablePrint {
 
    public static void main(String[] args) {
 
        //initiate variables
        Scanner userInput = new Scanner(System.in); 
        int userInt, mathInt, multFactor=1;
        String topRow="";
        String tempRow="--------";
        String lineRow="";
        String multiplicationRow="";
        
        //checks for negative int Values
        do 
        {
            System.out.println("Please enter a positive Integer to generate a multiplication table!");
            System.out.print("Desired Integer: ");
                userInt = userInput.nextInt();
                System.out.println("");
        } while (userInt<0);
 
            //top row builder for loop
            for (int i=1;userInt>=i;i++)
            {
                topRow = ""+topRow+"\t"+i;
            } //end of for loop    
            
            lineRow = tempRow.repeat(userInt);
            System.out.println(topRow);
            System.out.println(" "+" +"+lineRow);
 
            
            //column+row builder for loop
            for (;userInt>=multFactor;) {
                multiplicationRow=""; //clear String, linchpin in program
                
                    //string builder for loop
                    for (int i=1;userInt>=i;i++) 
                    {
                    mathInt = i*multFactor;
                    multiplicationRow = multiplicationRow+mathInt+"\t";
                    } //end of nested loop
                    
                System.out.print(multFactor+" |"+"\t"+multiplicationRow+"\n");
                multFactor++;
                
           } //end of for loop
            
    } // end of main method
    
} // end of class

