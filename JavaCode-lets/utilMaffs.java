/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.semester2.y;

/**
 * Purpose: 
 * @author katharya
 * Student Number: 
 * Date: 18/09/2025
 */

public class utilMaffs {

    public static double squareNumber(double numberInput) {
        double returnDouble = numberInput * numberInput;
        return returnDouble;
    }
    
    public static double cubeNumber(double numberInput) {
        double returnDouble = numberInput * numberInput * numberInput;
        return returnDouble;
    }
    
    public static double PI() {
        double returnPi = 22/7;
        return returnPi;
    }
    
    public static double areaSquare (double numberInput, double numberInput2) {
        double returnDouble = numberInput * numberInput2;
        return returnDouble;
    }
    
    public static double areaCircle (double numberInput) {
        double returnDouble = PI()*(numberInput * numberInput);
        return returnDouble;
    }
    
    public static double volumeCube (double numberInput) {
        double returnDouble = numberInput*numberInput*numberInput;
        return returnDouble;
    }
    
    public static double volumeSphere (double numberInput) {
        numberInput = cubeNumber(numberInput);
        double returnDouble = (4/3*PI()*(numberInput));
        return returnDouble;
    }
    
    public static double areaTriangle (double numberInput, double numberInput2) {
        double returnDouble = ((0.5 * numberInput) * numberInput2);
        return returnDouble;
    }
    
    public static double areaTrapezoid (double topInput, double baseInput, double heightInput) {
        double returnDouble = ((0.5*(topInput+baseInput))*heightInput);
        return returnDouble;
        
    }
    public static double areaSector (double inputRadius, double inputAngle) {
        inputRadius = squareNumber(inputRadius);
        double returnDouble = (0.5*inputRadius*inputAngle);
        return returnDouble;
    }
    
    public static void main(String[] args) {

        
    }

}
