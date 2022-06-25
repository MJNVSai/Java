/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg208w1a12a0;
import java.io.*;
import java.util.*;


/**
 *
 * @author cisco
 */
public class Employee_info 
{
    public static void main(String args[])
    {
        employee e1 = new employee();
        employee e2 = new employee();
        employee e3 = new employee();
        
        e1.insert(2501, "Rizwan", 50000);
        e2.insert(2502, "Mounav", 90000);
        e3.insert(2503, "Sai Vamsi", 45000);
        
        e1.display();
        e2.display();
        e3.display();
    }
}

class employee
{
    int id;
    String name;
    float salary;
    
    void insert(int i, String n, float s)
    {
        id = i;
        name = n;
        salary = s;
    }
    
    void display()
    {
        System.out.println("ID : " + id + ", Name : " + name + ", Salary : " + salary);
    }
}
