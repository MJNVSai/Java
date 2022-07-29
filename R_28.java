/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_28 
{
    public static void main(String args[])
    {
        rectangle28 r = new rectangle28();
        r.set(5, 10, 5);
        r.compute();
        System.out.println();
        cuboid28 c = new cuboid28();
        c.set(5, 10, 10);
        c.compute();
    }
}

abstract class Polygon
{
    int l,b,h;
    public void set(int l, int b, int h)
    {
        this.l = l;
        this.b = b;
        this.h = h;
    }
    public abstract void compute();
}

class rectangle28 extends Polygon
{
    public void compute()
    {
        System.out.println("Area of the Rectangle : " + (l*b));
    }
}

class cuboid28 extends Polygon
{
    public void compute()
    {
        System.out.println("Volume of the cuboid : " + (l*b*h));
    }
}
