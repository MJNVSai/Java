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
public class QRS 
{
    public static void main(String args[])
    {
        S obj = new S();
        
        obj.show3();
        obj.show2();
        obj.show1();
    }
}

class Q
{
    int q;
    public Q()
    {
        q = 20;
    }
    
    void show1()
    {
        System.out.println("q : " + q);
    }
}

class R extends Q
{
    int r;
    public R()
    {
        r = 40;
    }
    
    void show2()
    {
        System.out.println("r : " + r);
    }
}

class S extends R
{
    int s;
    public S()
    {
        s = 60;
    }
    
    void show3()
    {
        System.out.println("s : " + s);
    }
}
