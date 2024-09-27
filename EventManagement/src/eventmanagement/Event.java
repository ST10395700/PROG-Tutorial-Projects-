/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventmanagement;

import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author tvnmt
 */
public class Event {
    
    public  Date StartTime;
    public  Date EndTime; 
    public String Name;
    public String Location;
    public Program program;   
    public static Scanner readLn = new Scanner (System.in);
    
   
    public Event(){
    
        Program newProgram = new Program();
        this.program = newProgram.schedule();
    }
   
    
    
    
}
