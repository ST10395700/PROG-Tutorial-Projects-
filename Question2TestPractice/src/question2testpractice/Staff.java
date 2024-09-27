/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2testpractice;

/**
 *
 * @author tvnmt
 */
public abstract class Staff implements iStaff {

    private int NumStaffMembers;
    private String location;

    public Staff(int numberOfStaffMembers, String Location) {
        NumStaffMembers = numberOfStaffMembers;
        location = Location;
    }

    @Override
    public int getStaffNumber() {
        return NumStaffMembers;
    }

    @Override
    public String getStaffLocation() {
        return location;
    }

    @Override
    public String getStaffHiringProcess(){
    return "YES";
    }

   
}
