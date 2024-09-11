/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastpapers;

import static pastpapers.PastPapers.*;
//import static pastpapers.PastPapers.sales;

/**
 *
 * @author tvnmt
 */
public class EstateAgent implements IEstateAgent {

    public static double[] totalSales = new double[2];

    public static void CalcSales() {
        for (int row = 0; row < sales.length; row++) {
            double totSales = 0;
            for (int col = 0; col < sales[row].length; col++) {
                totSales += sales[row][col];
            }
            totalSales[row] = totSales;
            System.out.println("Total sales for " + agents[row] + " = R" + totSales);

        }
        System.out.println("\n");
    }

    public static void CalcCommission() {
        for (int row = 0; row < sales.length; row++) {
            double commission = 0;
            double totalSales = 0;
            for (int col = 0; col < sales[row].length; col++) {
                totalSales += sales[row][col];
            }
            commission = totalSales * 0.02;
            System.out.println("Sales Commission for " + agents[row] + " = R" + commission);
        }
        System.out.println("\n");
    }

    public static void CalcCommission2() {
        for (int i = 0; i < totalSales.length; i++) {
            double commission = totalSales[i] * 0.02;
            System.out.println("Sales Commission for " + agents[i] + " = R" + commission);
        }
    }
    
    @Override
    public double EstateAgentSales(double[] propertySales)
    {double totalSales = 0; 
        for (double Sale : propertySales) {
            totalSales+= Sale;
        }
        return totalSales;
    }
    @Override
    public double EstateAgentCommission(double propertySales) {
        double commission = propertySales * 0.02;
        //System.out.println("Sales Commission for " + agents[i] + " = R" + commission);
        return commission;
    }

    @Override
    public int TopEstateAgent(double[] totalSales) {
        int topAgentIndex = 0;
        for (int j = 0; j < totalSales.length; j++) {
            if (totalSales[j] > totalSales[topAgentIndex]) {
                topAgentIndex = j;
            }
        }
        System.out.println("Top performing estate agent: " + agents[topAgentIndex]);
        return topAgentIndex;
    }

}
