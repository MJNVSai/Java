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
public class R_45_b 
{
    public static void main(String args[])
    {
        teven45 t1 = new teven45();
        todd45 t2 = new todd45();
        tprime45 t3 = new tprime45();
        tnatural45 t4 = new tnatural45();
        t4.setPriority(10);
        t3.setPriority(8);
        t2.setPriority(5);
        t1.setPriority(3);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

class teven45 extends Thread
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

class todd45 extends Thread
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

class tprime45 extends Thread
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

class tnatural45 extends Thread
{
    public void run()
    {
        for(int i = 0; i <= 10; i++)
        {
            System.out.println("Natural number : " + i);
        }
    }
}