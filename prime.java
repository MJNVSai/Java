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
public class prime 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n,i,num,rem,temp,count = 0, flag = 0;
        
        System.out.println("Enter a 4 digit number : ");
        n = sc.nextInt();
        temp = n;
        
        while(n!=0)
        {
            rem = n%10;
            
            for(i = 1; i <= rem; i++)
            {
                if(rem%i == 0)
                {
                    flag = flag + i;
                }
            }
            
            if(flag == 2)
            {
                count = count + 1;
            }
            n = n/10;
        }
        System.out.println("the Number of primes : " + count);
    }
}
