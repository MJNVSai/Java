/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_9 
{
    public static void main(String args[])
    {
        Library l = new Library();
        l.display();
        System.out.println();
        l = new Library(10, "Python", "Shyam", 980, 1500);
        l.display();
        
    }
}

class Library
{
    int book_number;
    String book_name;
    String author_name;
    int price,no_of_pages;
    
    public Library()
    {
        book_number = 5;
        book_name = "Java";
        author_name = "Ashok Sir";
        price = 450;
        no_of_pages = 890;
    }
    
    public Library(int book_number, String book_name, String author_name, int price, int no_of_pages)
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
