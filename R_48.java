/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;
import java.io.*;
import java.util.*;
/**
 *
 * @author SHREE
 */
public class R_48 
{
    public static void main(String args[])
    {
        New ly = (year) ->
        {
            if((year%400 == 0) || (year%4 == 0) && (year%100 != 0))
            {
                return true;
            }
            else
            {
                return false;
            }
        };
        
        if(ly.test(2024))
        {
            System.out.println("It is a Leap Year");
        }
        else
        {
            System.out.println("It is not a Leap Year");
        }
    }
}

interface New
{
    boolean test(int n);
}
