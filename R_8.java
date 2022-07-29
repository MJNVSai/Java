/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_8 
{
    public static void main(String args[])
    {
        Average a = new Average();
        a.display();
    }
}

class Average
{
    int subject1,subject2;
    float average;
    public Average()
    {
        subject1 = 100;
        subject2 = 87;
        average = (subject1 + subject2)/2;
    }
    
    public void display()
    {
        System.out.println("Subject 1 marks : " + subject1);
        System.out.println("Subject 2 marks : " + subject2);
        System.out.println("Average Marks : " + average);
    }
}
