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
public class R_42 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of pairs : ");
        int n = sc.nextInt();
        String pair_left[] = new String[n];
        String pair_right[] = new String[n];
        
        System.out.println("Enter the pair names : ");
        for(int i = 0; i < n; i++)
        {
            pair_left[i] = sc.next();
            pair_right[i] = sc.next();
        }
        
        HashSet<String> hs = new HashSet<>();
        for(int j = 0; j < n; j++)
        {
            hs.add(pair_left[j] + " " + pair_right[j]);
            System.out.println("Hash set size : " + hs.size());
        }
        
        System.out.println("Hash set pairs are : ");
        for(String s : hs)
        {
            System.out.println(s);
        }
    }
}
