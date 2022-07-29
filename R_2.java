/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_2 
{
    public static void main(String args[])
    {
        Employee_R2 e = new Employee_R2();
        System.out.println(" Employee Number : " + e.eno);
        System.out.println(" Employee Name : " + e.ename);
        System.out.println(" Employee Salary : " + e.esal);
        System.out.println(" Employee Mobile Number : " + e.mobile);
    }
}

class Employee_R2
{
    int eno = 1541;
    long mobile = 1238966748;
    String ename = " Sundar Pichai ";
    float esal = 50.000f;
}