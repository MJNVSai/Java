/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_23 
{
    public static void main(String args[])
    {
        Department d = new Department("M.J.N.V", " Sai", 45, " IT ", 50000, 1, "IT", 5);
        d.display();
    }
}

class rperson_d
{
    String first_name;
    String last_name;
    
    public rperson_d(String fn, String ln)
    {
        first_name = fn;
        last_name = ln;
    }
}

class remployee_p1 extends rperson_d
{
    int eno;
    String edept;
    double esal;
    
    public remployee_p1(String fn, String ln,
            int eno, String edept, double esal)
    {
        super(fn,ln);
        
        this.eno = eno;
        this.edept = edept;
        this.esal = esal;
    }
}

class Department extends remployee_p1
{
    int dno;
    String dname;
    int experience;
    
    public Department(String fn, String ln,
            int eno, String edept, double esal,
            int dno, String dname, int experience)
    {
       super(fn, ln, eno, edept, esal);
       
       this.dno = dno;
       this.dname = dname;
       this.experience = experience;
    }
    
    void display()
    {
        System.out.println("First Name : " + first_name);
        System.out.println("Last Name : " + last_name);
        System.out.println("Employee Number : " + eno);
        System.out.println("Department : " + edept);
        System.out.println("Salary : " + esal);
        System.out.println("Department Number : " + dno);
        System.out.println("Department name : " + dname);
        System.out.println("Experience : " + experience);
    }
}
