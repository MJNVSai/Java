/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class inheritence_1 extends employee_1
{
    int bonous = 10000;
    public static void main(String args[])
    {
        inheritence_1 obj = new inheritence_1();
        System.out.println("Bonous : " + obj.bonous);
        System.out.println("Salary : " + obj.salary);
    }
}

class employee_1
{
    float salary = 40000;
}
