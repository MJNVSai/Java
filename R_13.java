/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_13 
{
    public static void main(String args[])
    {
        Cuboid_R c = new Cuboid_R();
        c.Cuboid();
        c.display();
        System.out.println();
        c.Cuboid(15, 30, 75);
        c.display();
    }
}

class Cuboid_R
{
    int length, bredth, height;
    
    public void Cuboid()
    {
        length = 100;
        bredth = 50;
        height = 80;
    }
    
    public void Cuboid(int length, int bredth, int height)
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
