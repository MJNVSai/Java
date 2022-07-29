/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_17 
{
    public static void main(String args[])
    {
        Emp_R17 e2 = new Emp_R17();
        e2.set();
        e2.display();
        System.out.println();
        e2.update();
        e2.display();
    }
}

class Emp_R17
{
    int eno;
    String ename;
    static String Company;
    
    public void set()
    {
        eno = 1543;
        ename = "xyz";
        Company = "Google";
    }
    
    public static void update()
    {
        Company = "Cisco";
    }
    
    public void display()
    {
        System.out.println("Employee Number : " + eno);
        System.out.println("Employee Name : " + ename);
        System.out.println("Company Name : " + Company);
    }
}
