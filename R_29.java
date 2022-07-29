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
public class R_29 
{
    public static void main(String args[])
    {
        Sortarray s = new Sortarray();
        s.set();
        s.sort();
        s.display();
    }
}

abstract class Sortalgorithm
{
    int a[] = new int[5];
    public void set()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements : ");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
    }
    
    public abstract void sort();
    
    public void display()
    {
        System.out.print("Array Elements are : ");
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}

class Sortarray extends Sortalgorithm
{
    public void sort()
    {
        int temp;
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < (a.length)-i-1; j++)
            {
                if(a[j] > a[j+1])
                {
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
