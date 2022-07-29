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
public class R_18 
{
    public static void main(String args[])
    {
        Reservation r = new Reservation();
        r.set_details("Msai", "saitemp@gmail.com");
        r.ticket();
        r.display();
    }
}

class Reservation
{
    String username;
    String email;
    int no_tickets;
    
    public void set_details(String username, String email)
    {
        this.username = username;
        this.email = email;
    }
    
    public void ticket()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Tickets : ");
        no_tickets = sc.nextInt();
        no_tickets = no_tickets - 1;
    }
    
    public void display()
    {
        System.out.println("User name : " + username);
        System.out.println("Email : " + email);
        System.out.println("No of tickets : " + no_tickets);
    }
}
