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
public class R_39 
{
   public static void checkper(float p) throws IneligibleException
   {
       if(p < 50)
       {
           throw new IneligibleException("Not Eligible for placements. ");
       }
       else
       {
           System.out.println("Eligible for placements : " + p);
       }
   }
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       float percent;
       System.out.print("Enter your Percentage : ");
       percent = sc.nextFloat();
       try
       {
           checkper(percent);
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
   }
}

class IneligibleException extends Exception
{
    public IneligibleException(String s)
    {
        super(s);
    }
}
