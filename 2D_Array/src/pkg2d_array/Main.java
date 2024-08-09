/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2d_array;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author tvnmt
 */
public class Main {
    public static String[][] Timetable = new String[5][8];
    public static int[] period = {1, 2, 3, 4, 5,6,7,8}; // set array size;
    public static String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    public static Scanner ScanLn = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // dispalyDayOfWeekArray(dayOfWeek);
        //generateTimeTable();
        
        
        captureTimeTable();
        displayTimetableArray();
    }
    
     public static void createTimetable() 
     {
         //JOptionPane.show
     }

    public static void captureTimeTable() {
        for (int i = 0; i < dayOfWeek.length; i++) {
            for (int j = 0; j < period.length; j++) {
                System.out.println("Enter module for "+dayOfWeek[i]+" period "+period[j]);
                Timetable[i][j] = ScanLn.nextLine();
            }
        }
        
      /* for (int row = 0; row < Timetable.length; row++) {
            for (int col = 0; col < Timetable[row].length; col++) {
                
            }  
        } */
        displayTimetableArray();
    }
    
    public static void generateTimeTable() {
            Timetable = new String[][] 
                {{"|PROG","|PROG","|NWEG","|NWEG","|ITPP","|ITPP","|FREE","|FREE"}
                ,{"|FREE","|FREE","|FREE","|FREE","|PROG","|PROG","|PRSE","|PRSE"}
                ,{"|FREE","|FREE","|NWEG","|NWEG","|ITPP","|ITPP","|PROG","|PROG"}
                ,{"|FREE","|FREE","|PRSE","|PRSE","|PROG","|PROG","|FREE","|FREE"}
                ,{"|PRSE","|PRSE","|NWEG","|NWEG","|FREE","|FREE","|FREE","|FREE"}
            };
    }

    public static void dispalyPeriodArray() {

    }

    public static void displayDayOfWeekArray() {
        String Output = "";
        for (String day : dayOfWeek) {
            Output += day + "\n";
        }
        System.out.println(Output);
        //JOptionPane.showMessageDialog(null, Output);
    }
    public static void displayTimetableArray() {
        String Output = "";
        for (String[] Day : Timetable) {
            for (String period : Day) {
                Output += period+"\t";
            }
              Output += "\n";
        }
        System.out.println(Output);
       // JOptionPane.showMessageDialog(null, Output);
    
    }

}
