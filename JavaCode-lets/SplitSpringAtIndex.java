/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.semester2.y;
import java.util.Scanner;

/**
 * Purpose: Split String into two parts given a given index value
 * @author Norbert Jez
 * Student Number: 
 * Date: 18/09/2025
 */

public class SplitSpringAtIndex {

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        int stringSplitIndex = 0;
        int stringLength=0;
        String userString = "";
        String[] splitStringArray = new String[2];
        
        System.out.println("Enter String to split: ");
        userString = userInput.nextLine();
        
        System.out.print("Split at which index to split: ");
        stringSplitIndex = userInput.nextInt();
        
        stringLength = userString.length();

        splitStringArray[0] = userString.substring(0,stringSplitIndex);
        splitStringArray[1] = userString.substring(stringSplitIndex,stringLength);
        
       for (String str : splitStringArray)
       {
            System.out.println(str);
       }
    }

}
