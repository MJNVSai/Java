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
public class Anonymous_object 
{
    void fact(int n)
    {
        int fact = 1;
        for(int i = 1; i <= n; i++)
        {
            fact = fact*i;  //Factorial logic;
        }
        System.out.println("Factorial is : " + fact);
    }
    
    public static void main(String args[])
    {
        new Anonymous_object().fact(5);
        new Anonymous_object().fact(8);
    }
}
