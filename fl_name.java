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
public class fl_name 
{
    public static void main(String args[])
    {
        employee_p obj = new employee_p("M J N V", "Sai", 45, " IT ", 50000);
        obj.display();
    }
}

class person
{
    String first_name;
    String last_name;
    
    public person(String fn, String ln)
    {
        first_name = fn;
        last_name = ln;
    }
}

class employee_p extends person
{
    int eno;
    String edept;
    double esal;
    
    public employee_p(String fn, String ln,
            int eno, String edept, double esal)
    {
        super(fn,ln);
        
        this.eno = eno;
        this.edept = edept;
        this.esal = esal;
    }
    
    void display()
    {
        System.out.println("First Name : " + first_name);
        System.out.println("Last Name : " + last_name);
        System.out.println("Employee Number : " + eno);
        System.out.println("Department : " + edept);
        System.out.println("Salary : " + esal);
    }
}
