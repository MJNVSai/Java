/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_11 
{
    public static void main(String args[])
    {
        Computer c = new Computer();
        c.display();
        System.out.println();
        c = new Computer("i4", 500, "Core 7", "Lenovo", "Not Activated");
        c.display();
    }
}

class Computer
{
    String Processor;
    float memory;
    String Type;
    String Cname;
    String Wstatus;
    
    public Computer()
    {
        Processor = "i3";
        memory = 1030;
        Type = "Core";
        Cname = "Acer Aspire";
        Wstatus = "Activated";
    }
    
    public Computer(String Processor, float memory, String Type, String Cname,String Wstatus)
    {
        this.Processor = Processor;
        this.memory = memory;
        this.Type = Type;
        this.Cname = Cname;
        this.Wstatus = Wstatus;
    }
    
    public void display()
    {
        System.out.println("System Processor : " + Processor);
        System.out.println("System Memory : " + memory);
        System.out.println("System Type : " + Type);
        System.out.println("System name : " + Cname);
        System.out.println("Windows Status : " + Wstatus);
    }
}