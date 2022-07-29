/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_27 
{
    public static void main(String args[])
    {
        staff s = new staff();
        s.setStaff(10043,15);
        
        s.setdata("M J N V", "Sai");
        s.display();
        employe e = new employe();
        e.setEmployee(12143, 50000.0, "CEO");
        e.displayEmployee();
        s.displayStaff();
    }
}

class person_r
{
  String fname,lname;
  void setdata(String fname,String lname)
  {
     this.fname=fname;
     this.lname=lname;
  }
  void display()
  {
      System.out.println("The fname and lname of person is: "+fname+" "+lname);
  }
}
class employe extends person_r
{
   int eno;
   double esal;
   String designation;
   void setEmployee(int eno, double esal, String designation)
   {
     this.eno=eno;
     this.esal=esal;
     this.designation=designation;
   }
   void displayEmployee()
  {
      System.out.println("The eno,esal and designation of employee is: "+eno+" "+esal+" "+designation);
  }   
}
class staff extends person_r
{
   int sno,exp;
   void setStaff(int sno,int exp)
   {
       this.sno=sno;
       this.exp=exp;
   }
   void displayStaff()
   {
       System.out.println("The Sno and Experience of Staff is: "+sno+" "+exp);
   }
}
