/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventmanagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author tvnmt
 */
public class Program {
    public static Scanner readLn = new Scanner (System.in);
    
    public static ArrayList<Artist> Artists = new ArrayList<Artist>();
    public ArrayList<Act> EventProgram = new ArrayList<Act>();
    
    public Program schedule()
    {
        String setTime = " ";
        String stage = " ";
        Artist artist = null;
        
        Act Set = new Act(setTime,stage,artist);
        EventProgram.add(Set);
        return ;
    }
         
}
