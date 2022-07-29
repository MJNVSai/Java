/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_36 
{
    public static void main(String args[])
    {
        try
        {
            int a[] = {10, 20, 30, 40, 50};
            System.out.println("Array element at a position : " + a[10]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
//            System.out.println(e.getMessage());
            System.out.println("Array index Error Occured");
        }
        System.out.println("Program is Still Running");
    }
}
