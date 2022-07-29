/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_20 
{
    public static void main(String args[])
    {
        B20 b = new B20();
        
        b.set_date(12, 7);
        b.assign(2022);
        b.display();
    }
}

class A20
{
    int x,y;
    
    void set_date(int a, int b)
    {
        x = a;
        y = b;
    }
}

class B20 extends A20
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
