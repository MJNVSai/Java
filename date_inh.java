/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;
import java.io.*;
/**
 *
 * @author SHREE
 */
public class date_inh 
{
    public static void main(String args[])
    {
        B b = new B();
        
        b.set_date(20, 6);
        b.assign(2022);
        b.display();
    }
}

class A
{
    int x,y;
    
    void set_date(int a, int b)
    {
        x = a;
        y = b;
    }
}

class B extends A
{
    int z;
//    A obj = new A();
    
    void assign(int c)
    {
        z = c;
    }
    
    void display()
    {
        System.out.println(" Date is : " + x + " / " + y + " / " + z);
    }
}