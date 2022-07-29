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
public class R_43 
{
    public static void main(String args[])
    {
        rcollege rc = new rcollege();
        rdepartment rd = new rdepartment();
        rc.start();
        rd.start();
    }
}

class rcollege extends Thread
{
    public void run()
    {
        for(int i = 0; i < 15; i++)
        {
            try
            {
                Thread.sleep(250);
            }
            catch(InterruptedException e)
            {
                System.out.println("hi");
            }
            System.out.println("VRSEC");
        }
    }
}

class rdepartment extends Thread
{
    public void run()
    {
        for(int i = 0; i < 30; i++)
        {
            try
            {
                Thread.sleep(250);
            }
            catch(Exception e)
            {
                System.out.println("hi");
            }
            System.out.println("CSE");
        }
    }
}
