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
public class R_46 
{
    public static void main(String args[])
    {
        A46 p1 = new A46();
        p1.start();
        p1.setPriority(8);
        int p = p1.getPriority();
        System.out.println("Thread Started : " + Thread.currentThread().getName());
        System.out.println("Thread Ended : " + Thread.currentThread().getName());
        System.out.println("Thread priority : " + p);
        
        B46 p2 = new B46();
        p2.start();
        p2.setPriority(8);
        System.out.println("Thread Started : " + Thread.currentThread().getName());
        System.out.println("Thread Ended : " + Thread.currentThread().getName());
        System.out.println("Thread priority : " + p2.getPriority());
        
        C46 p3 = new C46();
        p3.start();
        p3.setPriority(1);
        System.out.println("Thread Started : " + Thread.currentThread().getName());
        System.out.println("Thread Ended : " + Thread.currentThread().getName());
        System.out.println("Thread priority : " + p3.getPriority());
    }
}

class A46 extends Thread
{
    public void run()
    {
        Thread.yield();
        System.out.println("Course : Java");
    }
}

class B46 extends Thread
{
    public void run()
    {
        Thread.yield();
        System.out.println("Technology");
    }
}

class C46 extends Thread
{
    public void run()
    {
        Thread.yield();
        System.out.println("Second Year");
    }
}
