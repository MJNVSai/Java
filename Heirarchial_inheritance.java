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
public class Heirarchial_inheritance 
{
    public static void main(String args[])
    {
        CAT c = new CAT();
        c.eat();
        c.meow();
        
        DOG d = new DOG();
        d.bark();
        d.eat();
    }
}

class ANimal
{
    void eat()
    {
        System.out.println(" I am Very Hungary ............. ");
    }
}

class DOG extends ANimal
{
    void bark()
    {
        System.out.println(" Barking ................. ");
    }
}

class CAT extends ANimal
{
    void meow()
    {
        System.out.println(" Cat is Playing With  a Ball");
    }
}
