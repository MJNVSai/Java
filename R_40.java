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
public class R_40 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of the integers : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements : ");
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++)
        {
            list.add(sc.nextInt());
        }
        System.out.print("Enter a number : ");
        int q = sc.nextInt();
        while(q --> 0)
        {
            sc.nextLine();
            System.out.print("Enter the keyword : ");
            String s = sc.nextLine();
            
            if(s.equals("Insert"))
            {
                System.out.print("Enter the position : ");
                int x = sc.nextInt();
                System.out.print("Enter the list element : ");
                int y = sc.nextInt();
                
                list.add(y);
            }
            else
            {
                System.out.print("Enter the list element to delete : ");
                int x = sc.nextInt();
                list.remove(x);
            }
        }
        System.out.println("List elements are : ");
        for(int j = 0; j < list.size(); j++)
        {
            System.out.print(list.get(j) + " ");
        }
    }
}


