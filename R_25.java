/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_25 
{
    public static void main(String args[])
    {
        Employee25 e = new Employee25();
        e.companyDetails("Google","NewYork");
        e.showCompanyDetails();
        e.p1(4549390,"Sai",190000);
        e.showEmployee();
    }
}

class Employer
{
    String company_name,city;
    void companyDetails(String company_name,String city)
    {
        this.company_name = company_name;
        this.city = city;
    }
    void showCompanyDetails()
    {
        System.out.println("company info:");
        System.out.println(company_name);
        System.out.println(city);
    }
}
class Employee25 extends Employer
{
    int eno;
    String ename;
    float esal;
    void p1(int eno,String ename,float esal)
    {
        this.eno  = eno;
        this.ename = ename;
        this.esal = esal;
    }
    void showEmployee()
    {
        System.out.println("employee info:");
        System.out.println(eno);
        System.out.println(ename);    
        System.out.println(esal);        

    }
}
