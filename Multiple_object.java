/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg208w1a12a0;
import java.io.*;
import java.util.*;

/**
 *
 * @author cisco
 */
public class Multiple_object 
{
    public static void main(String args[])
    {
        rectangle1 r1 = new rectangle1(), r2 = new rectangle1(); // Multiple Object creation
        
        r1.insert(11, 22);
        r2.insert(44, 11);
        
        r1.calculate_Area();
        r2.calculate_Area();
    }
}

class rectangle1
{
    int length; // class variables
    int width;
    
    void insert(int length, int width)
    {
        this.length = length;
        this.width = width;     // this.class variable = formal variable
    }
    
    void calculate_Area()
    {
        System.out.println("Rectangle Area : " + (length*width));
    }
}
