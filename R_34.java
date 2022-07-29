/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_34 
{
    public static void main(String args[])
    {
        try
        {
            int num = 5/0;
        }
        catch(ArithmeticException e)
        {
//            System.out.println(e.getMessage());
            System.out.println("Input Error Occured");
        }
        System.out.println("Program is Still Running");
    }
}
