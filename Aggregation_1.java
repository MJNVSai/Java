/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;
import java.io.*;
/**
 *
 * @author SHREE
 */
public class Aggregation_1 
{
    public static void main(String args[])
    {
        circle c = new circle();
        double res = c.area(5);
        
        System.out.println(" Area of the Circle : " + res);
    }
}

class operation
{
    int square(int n)
    {
        return n*n;
    }
}

class circle
{
    operation op; // Applying the aggregation
    double pi = 3.14;
    
    double area(int radius)
    {
        op = new operation();
        int rsquare = op.square(radius);
        
        return pi*rsquare;
    }
}
