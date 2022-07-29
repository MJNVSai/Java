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
public class R_5 
{
    public static void main(String args[])
    {
        String Name1;
        char Gender1;
        int Age1,Mobile1;
        float CGPA1;
    
        InformationExtraction ie = new InformationExtraction();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Your Name : ");
        Name1 = sc.next();
        System.out.print("Enter gender (m/f) : ");
        Gender1 = sc.next().charAt(0);
        System.out.print("Enter age : ");
        Age1 = sc.nextInt();
        System.out.print("Enter mobile Number : ");
        Mobile1 = sc.nextInt();
        System.out.print("Enter CGPA points : ");
        CGPA1 = sc.nextFloat();
        
        ie.storeInformation(Name1, Gender1, Age1, Mobile1, CGPA1);
        System.out.println();
        ie.displayInformation();
    }
}

class InformationExtraction
{
    String Name;
    char Gender;
    int Age,Mobile;
    float CGPA;
    
    public void storeInformation(String Name, char Gender, int Age, int Mobile, float CGPA)
    {
        this.Name = Name;
        this.Gender = Gender;
        this.Age = Age;
        this.Mobile = Mobile;
        this.CGPA = CGPA;
    }
    
    public void displayInformation()
    {
        System.out.println("Student Name : " + Name);
        System.out.println("Gender : " + Gender);
        System.out.println("Student Age : " + Age);
        System.out.println("Mobile : " + Mobile);
        System.out.println("Student CGPA : " + CGPA);
    }
}
