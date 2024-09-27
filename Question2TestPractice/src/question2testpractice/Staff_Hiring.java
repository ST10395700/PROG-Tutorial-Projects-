/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2testpractice;

/**
 *
 * @author tvnmt
 */
public class Staff_Hiring extends Staff{
    
    public Staff_Hiring(int numberOfStaffMembers,String Location)
    { super( numberOfStaffMembers, Location);
    
    }
    public void printStaffHiring()
    { int numStaff = getStaffNumber();
    String location = getStaffLocation();
        System.out.println("STAFF HIRING REPORT\n*************************************\nLocation: "+location+"\nStaff Number: "+numStaff);
        
        if(numStaff<20)
        {
            System.out.println("Hiring Staff: "+getStaffHiringProcess()); 
        }
    }
}
