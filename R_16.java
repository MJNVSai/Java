/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_16 
{
    public static void main(String args[])
    {
        Emp_R e = new Emp_R();
        e.set();
        e.display();
    }
}

class Emp_R
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
    
    public void display()
    {
        System.out.println("Employee Number : " + eno);
        System.out.println("Employee Name : " + ename);
        System.out.println("Company Name : " + Company);
    }
}
