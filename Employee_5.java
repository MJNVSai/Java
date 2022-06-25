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
public class Employee_5 
{
    public static void main(String args[])
    {
        fte f = new fte("Sai", "Bhavanipuram", 20, "Male", 50000, "Manager");
        f.show2();
        
        pte p = new pte("Rizwan", "Times_hospital", 19, "Male", 8, 100);
        p.show1();
        p.calculate_pay();
        p.display();
        
    }
}

class emp
{
    String name;
    String address;
    int age;
    String gender;
    
    public emp(String name, String address, int age, String gender)
    {
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }
    
    void show1()
    {
        System.out.println();
        System.out.println("Employee name : " + name);
        System.out.println("Employee Address : " + address);
        System.out.println("Employee Age : " + age);
        System.out.println("Gender : " + gender);
        System.out.println();
    }
}

class fte extends emp
{
//    fte : Full Time Employee
    double salary;
    String desig;
    
    public fte(String name, String address, int age, String gender,
            double salary, String desig)
    {
        super(name, address, age, gender);
        this.salary = salary;
        this.desig = desig;
    }
    
    void show2()
    {
        System.out.println();
        System.out.println("Employee name : " + name);
        System.out.println("Employee Address : " + address);
        System.out.println("Employee Age : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("Employee Salary : " + salary);
        System.out.println("Employee Designation : " + desig);
        System.out.println();
    }
}

class pte extends emp
{
    float work_hours;
    float rate_hour;
    float toat_pay;
    
    public pte(String name, String address, int age, String gender,
            float work_hours, float rate_hour)
    {
        super(name, address, age, gender);
        this.work_hours = work_hours;
        this.rate_hour = rate_hour;
    }
    
    void calculate_pay()
    {
        toat_pay = work_hours*rate_hour;
    }
    
    void display()
    {
        System.out.println("The Toatl amout for employee is : " + toat_pay);
    }
}
