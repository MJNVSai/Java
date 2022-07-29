/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_33 
{
    public static void main(String args[])
    {
        motorcycle m = new motorcycle();
    }
}

class bicycle
{
    public String define_name()
    {
        return "a vehicle with pedals. ";
    }
}

class motorcycle extends bicycle
{
    public String define_name()
    {
        return "a cycle with an Engine. ";
    }
    
    public motorcycle()
    {
        System.out.println("Hello i am a motorCycle, i am " + define_name());
        String temp = super.define_name();
        System.out.println("My ancestor is a cycle who is " + temp);
    }
}