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
public class R_38 
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Java marks : ");
       int jm = sc.nextInt();
       System.out.print("Enter the maximum marks : ");
       int maxm = sc.nextInt();
       try
       {
           if(maxm == 0)
           {
               maxZero obj = new maxZero("You entered zero");
               throw obj;
           }
       }
       catch(maxZero e)
       {
           System.out.println(e.getMessage());
       }
   }
}

class maxZero extends Exception
{
    public maxZero(String s)
    {
        super(s);
    }
}
