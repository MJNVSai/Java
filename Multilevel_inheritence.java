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
public class Multilevel_inheritence 
{
    public static void main(String args[])
    {
        BabyDog bd = new BabyDog();
        bd.sleep();
        bd.bark();
        bd.eat();
    }
}

class Animal
{
    void eat()
    {
        System.out.println(" I am Very Hungary ");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Gaurd Dog is Barking");
    }
}

class BabyDog extends Dog
{
    void sleep()
    {
        System.out.println(" Baby Dog is Sleeping ");
    }
}
