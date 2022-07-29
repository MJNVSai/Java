/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;
import java.io.*;
import java.util.*;
/**
 *
 * @author SHREE
 */
public class R_4 
{
    public static void main(String args[])
    {
        Student_R4 s  = new Student_R4();
        s.setDetails();
        System.out.println();
        s.getDetails();
        
    }
}

class Student_R4
{
    int Sno;
    String Sname;
    int Java_marks, Daa_marks, Python_marks, Total;
    float Average;
    
    public void setDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Roll Number : ");
        Sno = sc.nextInt();
        System.out.print("Enter Student Name : ");
        Sname = sc.next();
        System.out.print("Enter Java marks : ");
        Java_marks = sc.nextInt();
        System.out.print("Enter Daa marks : ");
        Daa_marks = sc.nextInt();
        System.out.print("Enter Python Marks : ");
        Python_marks = sc.nextInt();
        
        Total = (Java_marks + Daa_marks + Python_marks);
        Average = Total/3;
    }
    
    public void getDetails()
    {
        System.out.println("Roll Number : " + Sno);
        System.out.println("Name : " + Sname);
        System.out.println("Java Marks : " + Java_marks);
        System.out.println("Daa marks : " + Daa_marks);
        System.out.println("Python Marks : " + Python_marks);
        System.out.println("Total Marks : " + Total);
        System.out.println("Average Marks : " + Average);
    }
}
