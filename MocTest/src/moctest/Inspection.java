/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moctest;

/**
 *
 * @author tvnmt
 */
public class Inspection {
    
    public static String[] months = {"Jan","Feb", "Mar"};
    public static String[] hospitals = { "Hospital 1","Hospital 2", "Hospital 3"};
    public static int[][] numInspections = {{4,8,6},{5,4,2},{4,2,8}};
    
    public static int[] CalcAvg1()
    { int[] Averages =new int[numInspections.length]; 
        for (int i = 0; i < numInspections.length; i++) {
            for (int j = 0; j < numInspections[i].length; j++) {
                Averages[i] += numInspections[i][j];
            }
            Averages[i] += Averages[i]/numInspections[i].length;
        }
        return Averages;
    }
    
    public static int CalcAvg2(int[] inspections)
    { int avg =0;
        for (int i = 0; i < inspections.length; i++) {
            avg += inspections[i];
            
        }
        avg+= avg/3.0;
        return avg;
    }
    
    public static void InspectionReport()
    { String output = "*********************************************************************";
        output += "\nHealth Inspection Report";
        output += "\n*********************************************************************";
        output += String.format("\n%-20s %-15s%-15s%-15s AVG", "",months[0],months[1],months[2]);
        //int[] Avgs= CalcAvg1();
        for (int i = 0; i < numInspections.length; i++) {
            double Avg =0;
            String inspections = "";
            for (int j = 0; j < numInspections.length; j++) {
             Avg += (numInspections[i][j] );    
             inspections += String.format("%-15s ",numInspections[i][j]);
            }
            Avg = Avg/numInspections.length;
           // Avg =  CalcAvg2(numInspections[i]);
            output += String.format("\n%-15s: --> %-45s%.2f", hospitals[i],inspections,Avg /*Avgs[i]*/);
        }
        output += "\n*********************************************************************";
        output += "\nMonthly Totals";
        output += "\n*********************************************************************"; 
        for (int i = 0; i < numInspections.length; i++) {
            output +=  ("\n"+ hospitals[i]+":");
            double total =0;
            for (int j = 0; j < numInspections[i].length; j++) {
                 total += numInspections[i][j]; 
            }
            output += String.format("\t%.1f", total);
        }
        
        System.out.println(output);
    
    }
    
}
