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
public class Student_info 
{
    public static void main(String args[])
    {
        student s1 = new student();
        student s2 = new student();
        
        s1.insertRecord(123, "Ajay");
        s1.displayInformation();
        
        s2.insertRecord(03, "A.Charan");
        s2.displayInformation();
    }
}

class student
{
    int roll_no;
    String name;
    
    void insertRecord(int r, String n)
    {
        roll_no = r;
        name = n;
    }
    
    void displayInformation()
    {
        System.out.println("Roll number : " + roll_no + ", Student Name : " + name);
    }
}
