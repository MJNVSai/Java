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
public class R_45_a 
{
    public static void main(String args[])
    {
        teven t1 = new teven();
        todd t2 = new todd();
        tprime t3 = new tprime();
        tnatural t4 = new tnatural();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class teven extends Thread
{
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            if(i%2 == 0)
            {
                System.out.println("Even number : " + i);
            }
        }
    }
}

class todd extends Thread
{
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            if(i%2 != 0)
            {
                System.out.println("Odd number : " + i);
            }
        }
    }
}

class tprime extends Thread
{
    public void run()
    {
        int count = 0;
        for(int i = 2; i < 10; i++)
        {
            for(int j = 2; j < i; j++)
            {
                if(i%j == 0)
                {
                    count += 1;
                }
            }
            if(count == 0)
            {
                System.out.println("prime number : " + i);
            }
        }
    }
}

class tnatural extends Thread
{
    public void run()
    {
        for(int i = 0; i <= 10; i++)
        {
            System.out.println("Natural number : " + i);
        }
    }
}
