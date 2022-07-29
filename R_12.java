/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_12 
{
    public static void main(String args[])
    {
        Cuboid c = new Cuboid();
        c.display();
        System.out.println();
        c = new Cuboid(50,15,60);
        c.display();
    }
}

class Cuboid
{
    int length, bredth, height;
    
    public Cuboid()
    {
        length = 100;
        bredth = 50;
        height = 80;
    }
    
    public Cuboid(int length, int bredth, int height)
    {
        this.length = length;
        this.bredth = bredth;
        this.height = height;
    }
    
    public void display()
    {
        int volume;
        volume = (length * bredth * height);
        System.out.println(" Volume of the Cuboid : " + volume);
    }
}
