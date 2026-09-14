/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.semester2.y;

/**
 * Purpose: 
 * @author 
 * Student Number: 
 * Date: 18/09/2025
 */

public class Initiliser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] shoppingList = {
            "Coke", "Mint Ice cream", "Chocolate", "kebab", "Pizza", "Burgers",
            "Muffin", "milk"
        };
        
        //Edit the last item in the list
        //replace "milk" with "cake"
        //length of the list is 8
        //index goes from 0 to 7
        //shoppingLisy[7] is "milk"
        
        shoppingList[shoppingList.length-1] = "Cake";
        
        for (String item : shoppingList)
        {
            System.out.println(item);
        }
        
         for (String item : shoppingList)
        {
            char result = item.charAt(0);
            System.out.print(result + " ");
        }
         
         System.out.println("");
         for (String item : shoppingList)
        {
            char result = item.charAt(item.length()-2);
            System.out.print(result + " ");
        }
         for (String item : shoppingList)
        {
            if (item.length() >=5)
            {
                System.out.println(item);
            }
        }
        boolean flag=false;
        boolean flag2=true;
         
          for (int i=0; i<shoppingList.length;i++)
        {
            if (shoppingList[i].compareToIgnoreCase("Burgers")==0) {
                flag = true;
                flag2 = false;
            }
            
            if (flag) {
                System.out.println(i + " is the Index value of Burgers");
                System.out.println("Burgers have been found!");
                flag = false;
                
            if (flag2) {
                System.out.println("Burgers not found!");
            }
                
            }
        }
          
        int count=0;
          for (String item : shoppingList)
        {
            if (item.charAt(item.length()-1)=='s')
            {
                count++;
            }
        }
          System.out.println("Number of Strings ending in an s: "+count);
    }  
    }


