/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_31 
{
    public static void main(String args[])
    {
        Arithmetic a = new Arithmetic();
        System.out.println("Super class is : " + a.getClass());
        System.out.println("Addition of 2 numbers : " + a.add(100, 200));
    }
}
class Arithmetic
{
    public int add(int a, int b)
    {
        int sum = a + b;
        return sum;
    }
}

class Adder extends Arithmetic
{
    public void display()
    {
        System.out.println("This is Child class named Adder");
    }
}