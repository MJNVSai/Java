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
public class R_7 
{
    public static void main(String args[])
    {
        int book_number1;
        String book_name1;
        String author_name1;
        int price1,no_of_pages1;
    
        Library_R7 lr = new Library_R7();
        Scanner sc = new Scanner(System.in);
        
        lr.default_R();
        lr.display();
        System.out.println();
        
        System.out.print("Enter Book Number : ");
        book_number1 = sc.nextInt();
        System.out.print("Enter the Book Name : ");
        book_name1 = sc.next();
        System.out.print("Enter the Author name of the book : ");
        author_name1 = sc.next();
        System.out.print("Enter the Book Price : ");
        price1 = sc.nextInt();
        System.out.print("Enter the Number of pages in the Book : ");
        no_of_pages1 = sc.nextInt();
        
        lr.parameter_R(book_number1, book_name1, author_name1, price1, no_of_pages1);
        lr.display();
    }
}

class Library_R7
{
    int book_number;
    String book_name;
    String author_name;
    int price,no_of_pages;
    
    public void default_R()
    {
        book_number = 5;
        book_name = "Java";
        author_name = "Ashok Sir";
        price = 450;
        no_of_pages = 890;
    }
    
    public void parameter_R(int book_number, String book_name, String author_name, int price, int no_of_pages)
    {
        this.book_number = book_number;
        this.book_name = book_name;
        this.author_name = author_name;
        this.price = price;
        this.no_of_pages = no_of_pages;
    }
    
    public void display()
    {
        System.out.println("Book Number : " + book_number);
        System.out.println("Book Name : " + book_name);
        System.out.println("Author Name : " + author_name);
        System.out.println("Book Price : " + price);
        System.out.println("No of Pages in a Book : " + no_of_pages);
    }
}
