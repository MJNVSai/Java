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
public class R_37 
{
    public static void main(String args[])
    {
        int a,b,c;
        int arr[] = {1, 2, 3, 50};
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.print("Enter 1st number : ");
            a = sc.nextInt();
            System.out.print("Enter 2nd number : ");
            b = sc.nextInt();
            c = a/b;
            System.out.println("Division result : " + c);
            System.out.println("Array element : " + arr[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic error cought");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index Error");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Wrong input");
        }
    }
}
