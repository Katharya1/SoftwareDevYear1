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
public class Lab9bExercise5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Initialise Variables
        int rowIndex;
        int colIndex;
        int intIndex=0;
        int sizeArray[] = new int[2];
        
        Scanner userInput = new Scanner(System.in);
        
        //ask user for size of Matrice
        System.out.println("How many columns would you like?");
        sizeArray[0] = userInput.nextInt();
        System.out.println("How many rows would you like?");
        sizeArray[1] = userInput.nextInt();
        
        //set size
        char xoArray[][] = new char[sizeArray[1]][sizeArray[0]];
        
        //Main forloop to inject pattern
        for (rowIndex = 0; rowIndex < sizeArray[1]; rowIndex++) {
            for (colIndex = 0; colIndex<sizeArray[0]; colIndex++) {
                if ((intIndex==0||intIndex%2==0)) 
                {
                    xoArray[rowIndex][colIndex] = 'O';
                    intIndex++;
                }
                else if (intIndex%2==1) 
                {
                    xoArray[rowIndex][colIndex] = 'X';
                    intIndex++;
                }
            }
        }
        
        System.out.println("");
        //second forloop to print matrice
        for (rowIndex = 0; rowIndex <sizeArray[1]; rowIndex++) {
            for (colIndex =0; colIndex<sizeArray[0]; colIndex++) {
                System.out.print(" "+xoArray[rowIndex][colIndex]);

                if (colIndex==sizeArray[0]-1)
                {
                    System.out.println("");
                }
            }
        }
    }
    
}