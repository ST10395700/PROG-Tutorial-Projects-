/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventmanagement;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author tvnmt
 */
public class Act {
    public static Scanner readLn = new Scanner (System.in);
    
    public Artist Artist;  
    public String SetTime; 
    public String Stage;

    public Act(String setTime,String stage,Artist artist) 
    {
        this.SetTime = setTime;
        this.Stage = stage;
        this.Artist = artist;
        
    }
}
