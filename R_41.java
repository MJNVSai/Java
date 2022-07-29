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
public class R_41 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList[] list = new ArrayList[20002];
        System.out.print("Enter number of lines : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            list[i] = new ArrayList();
            System.out.print("Enter a number 1 : ");
            int x = sc.nextInt();
            
            System.out.println("Enter the elements : ");
            for(int j = 1; j <= x; j++)
            {
                int val = sc.nextInt();
                list[i].add(val);
            }
        }
        
        System.out.print("Enter a number 2 : ");
        int q = sc.nextInt();
        
        for(int i = 1; i <= q; i++)
        {
            int x,y;
            System.out.print("Enter 1st number : ");
            x = sc.nextInt();
            System.out.print("Enter 2nd number : ");
            y = sc.nextInt();
            
            try
            {
                System.out.println("result : " + list[x].get(y-1));
            }
            catch(Exception e)
            {
                System.out.println("Error !!! ");
            }
        }
    }
}
