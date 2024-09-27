/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2testpractice;

import java.util.Scanner;

/**
 *
 * @author tvnmt
 */
public class Use_Staff {
    public static void  instantiate()
    {   Scanner readLn = new Scanner (System.in);
        System.out.println("Enter the current staff number");
        int staffNum =  Integer.parseInt(readLn.next());
        
        System.out.println("Enter the staff hiring location");
        String Location =  readLn.next();
        
        Staff_Hiring newStaffHiring = new Staff_Hiring(staffNum,Location);
        newStaffHiring.printStaffHiring();
        
    }
}
