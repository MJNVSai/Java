/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg208w1a12a0;
import java.io.*;


/**
 *
 * @author cisco
 */
public class Bank_Account // main class
{
    public static void main(String args[])
    {
        account a1 = new account();
        
        a1.insert(465732148, "Prabhuram", 50000);
        a1.display();
        System.out.println();
        
        a1.check_balance();
        a1.deposit(30000);
        a1.check_balance();
        
        a1.withdraw(10000);
        a1.check_balance();
        
        System.out.println();
        a1.display();
    }
}

class account
{
    int acc_no;
    String name;
    float amount;
    
    void insert(int a, String n, float amt)
    {
        acc_no = a;
        name = n;
        amount = amt;
    }
    
    void deposit(float amt)
    {
        amount = amount + amt;
        System.out.println(amt + " Successfully Deposited");
    }
    
    void withdraw(float amt)
    {
        if(amount < amt)
        {
            System.out.println(" Insufficent Balance");
        }
        else
        {
            amount = amount - amt;
            System.out.println(amt + " Successfully With drawed");
        }
    }
    
    void check_balance()
    {
        System.out.println("Balance Amount is : " + amount);
    }
    
    void display()
    {
        System.out.println("Account Number : " + acc_no);
        System.out.println("Account Holder Name : " + name);
        System.out.println("Amount : " + amount);
    }
}
