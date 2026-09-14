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

public class Lab9a {

    public static void main(String[] args) {

        int myIntArray[] = new int[6];
        int totalSumOfInts = 0;
        int userCheckInt;
        boolean intExistsFlag=false;
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("""
                           You will be asked to enter 6 integers
                           Press enter after each one
                           You will then be asked to input another integer
                           The program will check if it's in the array and output the result
                           Then it'll compute the sum of all values in the array and output""");
        System.out.println("--------------------------------------------------------------------\n");
        
        for (int i=0; i < myIntArray.length;i++) 
        {
            System.out.printf("Please enter integer number %d: \n",(i+1));
            myIntArray[i] = userInput.nextInt();
        }
        
        System.out.print("\nPlease input an integer to check if it's located in the array: \n");
            userCheckInt = userInput.nextInt();
            
        for (int i : myIntArray)   
        {
            intExistsFlag = (userCheckInt == i);
            totalSumOfInts = i + totalSumOfInts;
        }
        
        if (intExistsFlag) 
        {
            System.out.printf("The integer '%d' exists in the array!\n",userCheckInt);
        } 
        else 
        {
            System.out.printf("The integer '%d' dpes not exist in the array\n",userCheckInt); 
        }
        System.out.println("The total sum of the array is: "+totalSumOfInts);
    }
}
