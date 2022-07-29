/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_26 
{
    public static void main(String args[])
    {
        grade g = new grade();
        g.getdata(245,"Sai");
        g.display();
        g.getdata2(92,"IT",95,84,85);
        g.display2();
        g.average();
        g.display3();
    }
}

class Personr
{
    int ssn;
    String name;
    void getdata(int ssn,String name)
    {
         this.ssn=ssn;
         this.name=name;
    }
    void display()
    {
       System.out.println("The ssn of person is: "+ssn);
       System.out.println("The name of person is: "+name);
    }
}
class studentr extends Personr
{
   int rollno;
   String branch;
   float mark1,mark2,mark3;
   void getdata2(int rollno,String branch,float mark1,float mark2,float mark3)
    {
         this.rollno=rollno;
         this.branch=branch;
         this.mark1=mark1;
         this.mark2=mark2;
         this.mark3=mark3;
    }
    void display2()
    {
       System.out.println("The rollno of student is: "+rollno);
       System.out.println("The branch of student is: "+branch);
       System.out.println("The Mark1,Mark2 and Mark3 are:"+mark1+" "+mark2+" "+mark3);
       
    }
   
}
class grade extends studentr
{
   float avg; 
   float sum;
   void average()
   {
     sum = mark1+mark2+mark3;
     avg = sum/3;
   }
   void display3()
   {
       if(avg>=90)
       {
         System.out.println("A grade");
       }
       else if(avg>=80)
       {
         System.out.println("B grade");
       }
       else if(avg>=70)
       {
         System.out.println("C grade");
       }
       else if(avg<70)
       {
          System.out.println("Fail");
       }
   }
   
}
