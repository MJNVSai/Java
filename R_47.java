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
public class R_47 
{
    public static void main(String args[])
    {
        A47 p1 = new A47();
        p1.start();
        p1.setPriority(6);
        int p = p1.getPriority();
        System.out.println("Thread Started : " + Thread.currentThread().getName());
        System.out.println("Thread Ended : " + Thread.currentThread().getName());
        System.out.println("Thread priority : " + p);
        
        B47 p2 = new B47();
        p2.start();
        p2.setPriority(6);
        System.out.println("Thread Started : " + Thread.currentThread().getName());
        System.out.println("Thread Ended : " + Thread.currentThread().getName());
        System.out.println("Thread priority : " + p2.getPriority());
        
        C47 p3 = new C47();
        p3.start();
        p3.setPriority(2);
        System.out.println("Thread Started : " + Thread.currentThread().getName());
        System.out.println("Thread Ended : " + Thread.currentThread().getName());
        System.out.println("Thread priority : " + p3.getPriority());
    }
}

class A47 extends Thread
{
    public void run()
    {
        Thread.yield();
        System.out.println("Welcome to");
    }
}

class B47 extends Thread
{
    public void run()
    {
        Thread.yield();
        System.out.println("The Programming");
    }
}

class C47 extends Thread
{
    public void run()
    {
        Thread.yield();
        System.out.println("Second Year");
    }
}
