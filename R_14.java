/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_14 
{
    public static void main(String args[])
    {
        Rectangle2 r = new Rectangle2();
        r.area();
        r.display();
        System.out.println();
        r.area(50, 100);
        r.display();
    }
}

class Rectangle2
{
    int length, bredth;
    
    public void area()
    {
        length = 100;
        bredth = 200;
    }
    
    public void area(int length, int bredth)
    {
        this.length = length;
        this.bredth = bredth;
    }
    
    public void display()
    {
        System.out.println("Area of the rectangle : " + (length * bredth));
        System.out.println("Perimeter of the rectangle : " + (2*(length + bredth)));
    }
}
