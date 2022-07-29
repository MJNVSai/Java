/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_3 
{
    public static void main(String args[])
    {
        Student_R3 s = new Student_R3();
        s.setDetails(45, "Msai", 10, 8, 10);
        s.getDetails();
    }
}

class Student_R3
{
    int Sno;
    String Sname;
    int Java_marks, Daa_marks, Python_marks, Total;
    float Average;
    
    public void setDetails(int Sno, String Sname, int Java_marks, int Daa_marks, int Python_marks)
    {
        this.Sno = Sno;
        this.Sname = Sname;
        this.Java_marks = Java_marks;
        this.Daa_marks = Daa_marks;
        this.Python_marks = Python_marks;
        
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
