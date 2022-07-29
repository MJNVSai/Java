/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_21 
{
    public static void main(String args[])
    {
        S21 obj = new S21();
        
        obj.show3();
        obj.show2();
        obj.show1();
    }
}

class Q21
{
    int q;
    public Q21()
    {
        q = 20;
    }
    
    void show1()
    {
        System.out.println("q : " + q);
    }
}

class R21 extends Q21
{
    int r;
    public R21()
    {
        r = 40;
    }
    
    void show2()
    {
        System.out.println("r : " + r);
    }
}

class S21 extends R21
{
    int s;
    public S21()
    {
        s = 60;
    }
    
    void show3()
    {
        System.out.println("s : " + s);
    }
}
