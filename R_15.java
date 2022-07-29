/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_15 
{
    public static void main(String args[])
    {
        Rectangle r = new Rectangle();
        r.display();
        System.out.println();
        r = new Rectangle(50,100);
        r.display();
    }
}

class Rectangle
{
    int length, bredth;
    
    public Rectangle()
    {
        length = 100;
        bredth = 200;
    }
    
    public Rectangle(int length, int bredth)
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
