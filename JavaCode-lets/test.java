/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 * Purpose: 
 * @author
 * Student Number: 
 * Date: 18/09/2025
 */


public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the size of the table (e.g., 12 for a 12x12 table)
        System.out.print("Enter the size of the multiplication table (e.g., 12): ");
        int size = scanner.nextInt();

        // Print the header row numbers
        System.out.print(" \t|");
        for (int i = 1; i <= size; i++) {
            System.out.print("\t" + i);
        }
        System.out.println("\n----------------------------------------------------------------------------------");

        // Generate the table using nested for loops
        for (int i = 1; i <= size; i++) {
            // Print the current row number as a header
            System.out.print(i + "\t|");
            for (int j = 1; j <= size; j++) {
                // Calculate and print the product, followed by a tab for alignment
                System.out.print("\t" + (i * j));
            }
            // Move to the next line after each row is complete
            System.out.println();
        }

        scanner.close();
    }
}

