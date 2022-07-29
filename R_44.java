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
public class R_44 
{
    public static void main(String args[])
    {
        square44 s = new square44();
        cuboid44 c = new cuboid44();
        s.start();
        c.start();
    }
}

class square44 extends Thread
{
    @Override
    public void run()
    {
        int n = 5;
        for(int i = 0; i < 10; i++)
        {
            try
            {
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                System.out.println(" Square Exception ");
            }
            System.out.println("Area of the Square of length 5 : " + (n*n));
        }
    }
}

class cuboid44 extends Thread
{
    @Override
    public void run()
    {
        int l = 5, b = 10, h = 20;
        for(int i = 0; i < 10; i++)
        {
            try
            {
                Thread.sleep(3000);
            }
            catch(Exception e)
            {
                System.out.println(" Cuboid Exception ");
            }
            System.out.println("Volume of the Cuboid with dimensions 5,10,20 : " + (l*b*h));
        }
    }
}