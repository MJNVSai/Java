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
public class Sparse_matrix 
{
    public static void main(String args[])
    {
        int i,j,zero = 0,order_div;
        int sparse[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Matrix 1 elements : ");
        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 3; j++)
            {
                sparse[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        
        for(int k = 0; k < 3; k++)
        {
            for(int l = 0; l < 3; l++)
            {
                if(sparse[k][l] == 0)
                {
                    zero++;
                }
            }
        }
        
        order_div = (3*3)/2; /* 3*3 means rows*columns */
        
        if(zero > order_div)
        {
            System.out.println("Given Matrix is a Sparse Matrix");
        }
        else
        {
            System.out.println("Given matrix is not an Sparse Matrix");
        }
        
        smsg(); // Static Fuction/method
        
        Sparse_matrix obj = new Sparse_matrix(); // Instance Function/method
        obj.imsg();
    }
    
    public static void smsg()
    {
        System.out.println("What are you doing here? go and listen the Online Classes.....");
    }
    
    public void imsg()
    {
        System.out.println("Did you complete Your Observation Book ?");
    }
}
