/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_30 
{
    public static void main(String args[])
    {
        rBabyDog bd = new rBabyDog();
        bd.sleep();
        bd.bark();
        bd.eat();
    }
}

class rAnimal
{
    void eat()
    {
        System.out.println(" I am Very Hungary ");
    }
}

class rDog extends rAnimal
{
    void bark()
    {
        System.out.println("Gaurd Dog is Barking");
    }
}

class rBabyDog extends rDog
{
    void sleep()
    {
        System.out.println(" Baby Dog is Sleeping ");
    }
}
