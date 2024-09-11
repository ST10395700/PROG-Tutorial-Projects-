/*
 * Click nbfs://nbhost/SystemfileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemfileSystem/Templates/Classes/Main.java to edit this template
 */
package pastpapers;
import static pastpapers.EstateAgent.CalcSales;
import static pastpapers.EstateAgent.CalcCommission;
import static pastpapers.EstateAgent.totalSales;

/**
 *
 * @author tvnmt
 */
public class PastPapers {

    /**
     * @param args the command line arguments
     */
    public static double sales[][] = new double[2][3];
    public static String[] agents = {"Joe Bloggs", "Jane Doe"};
    public static String[] months = {"JAN", "fEB", "MAR"};

    public static void main(String[] args) {
        // TODO code application logic here
        Question1_1();
        //CalcSales();
          EstateAgent myAgent = new EstateAgent();
         ;
        for (int i = 0; i < sales.length; i++) {
           totalSales[i] = myAgent.EstateAgentSales(sales[i]);
        System.out.println("Total sales for " + agents[i] + " = R" +  totalSales[i]);
        }
        System.out.println("\n");
        for (int i = 0; i < totalSales.length; i++) {
            System.out.println("Sales Commission for " + agents[i] + " = R" + myAgent.EstateAgentCommission( totalSales[i]));
        }
        System.out.println("\n");
        myAgent.TopEstateAgent(totalSales);
        //CalcCommission();
    }

    public static void Question1_1() {

        sales = new double[][]{{800000.00, 1500000.00, 2000000.00}, {700000.00, 1200000.00, 1600000.00}};

        String output = String.format("Estate Agents Sales Report\n %-20s", "");
        for (int col = 0; col < months.length; col++) {
            output += String.format("%-20s", months[col]);
        }
        output += ("\n----------------------------------------------------------------------------");
        System.out.println(output);

        for (int row = 0; row < sales.length; row++) {
            output = String.format("%-20s", agents[row]);
            for (int col = 0; col < sales[row].length; col++) {
                output += String.format("R %-20s", sales[row][col]);
            }
            System.out.println(output);
        }
        System.out.println("\n");
    }



  
}
