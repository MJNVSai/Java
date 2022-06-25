/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg208w1a12a0;
import java.io.*;
/**
 *
 * @author cisco
 */
public class student_info1 
{
    public static void main(String args[])
    {
        student1 s1 = new student1();
        
        s1.display(); // Default method will invoked
        System.out.println();
        
        s1.insert(268, "Charan", 100); // Parametrized method invoked
        s1.display();
        System.out.println();
        
        student2 s2 = new student2(), s3 = new student2(295, "Manohar", 90);
        s2.display(); // Default constructor will be invoked
        System.out.println();
        
        s3.display(); // Parameterized constructor will be invoked
        
        
    }
}

class student1
{
    int sno = 01;
    String sname = "XYZ";
    float smarks = 50;
    
    void insert(int r, String n, float f)
    {
        sno = r;
        sname = n;
        smarks = f;
    }  
    
    void display()
    {
        System.out.println("Student number : " + sno);
        System.out.println("Student Name : " + sname);
        System.out.println("Student Marks : " + smarks);
    }
}

class student2
{
    int sno;
    String sname;
    float smarks;
    
    public student2()
    {
        sno = 04;
        sname = "PQR";
        smarks = 89;
    }
    
    public student2(int r, String n, float f)
    {
        sno = r;
        sname = n;
        smarks = f;
    }
    
    void display()
    {
        System.out.println("Student number : " + sno);
        System.out.println("Student Name : " + sname);
        System.out.println("Student Marks : " + smarks);
    }
}
