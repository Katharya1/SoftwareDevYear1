/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semester2.y;

/**
 *
 * @author Katharya
 */
    class footBaller {
        
        String name;
        int goalScored;
        int pointsScored;
        int totalPointsScored;

        //Construtor, no parameters
    public footBaller()
    {
    
    }
    
    public footBaller (String theName, int goals, int points, int totalPoints)
    {
        name=theName;
        goalScored=goals;
        pointsScored=points;
        totalPointsScored=totalPoints;
    }
        //Setter methods
    public void setName(String theName)
    {
        name=theName;
    }
    public void setGoalScored(int goals)
    {
        goalScored=goals;
    }
    public void setPointScored(int pointScored)
    {
        pointsScored=pointScored;
        int totalPoints = (goalScored*3) + pointsScored;
        totalPointsScored = totalPoints;
    }
       //Getter Methods
    public String getName()
    {
        return name;
    }
    public int getGoalScored()
    {
        return goalScored;
    }
    public int getPointsScored()
    {
        return pointsScored;
    }
    public int getTotalPoints()
    {
        int totalPoints = (goalScored*3) + pointsScored;
        totalPointsScored = totalPoints;
        return totalPointsScored;
    }
        //toStringMethod
    public String toString(){
        String myString;
        
        myString ="";
        myString += "\n Name : " +name;
        myString += "\n Goals scored: " + goalScored;
        myString += "\n Points scored: " + pointsScored;
        myString += "\n Total points scored: " + totalPointsScored;
        
        return myString;
    }
}
