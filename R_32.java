/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg208w1a12a0;

/**
 *
 * @author SHREE
 */
public class R_32 
{
    public static void main(String args[])
    {
        sports s1 = new sports();
        soccer s2 = new soccer();
        System.out.println(s1.get_name());
        s1.get_number_of_team_members();
        System.out.println(s2.get_name());
        s2.get_number_of_team_members();
    }
}

class sports
{
    public String get_name()
    {
        return "Generic Sports";
    }
    
    public void get_number_of_team_members()
    {
        System.out.println("Each team has n players in " + get_name());
    }
}

class soccer extends sports
{
    @Override
    public String get_name()
    {
        return "Soccer Class";
    }
    
    public void get_number_of_team_members()
    {
        System.out.println("Each team has 11 players in the Soccer class");
    }
}
