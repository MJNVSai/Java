/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;
import java.io.*;
import java.util.stream.*;

/**
 *
 * @author SHREE
 */
public class R_49 
{
    public static void main(String args[])
    {
        int sum = Stream.iterate(new int[]{0,1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(n -> n[0])
                .mapToInt(n -> n)
                .sum();
        System.out.println("Sum of first 10 fibonacci numbers : " + sum);
    }
}
