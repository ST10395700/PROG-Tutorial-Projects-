/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exampractice2;

import java.util.Scanner;

/**
 *
 * @author tvnmt
 */
public class Sales {

    public static double[][] sales = new double[][] {{500, 100, 500}, {70, 80, 200}, {100, 100, 200}, {100, 70, 50}, {300, 100, 500}};
    public static String[] manufacturer = new String[]{"Triumph", "Honda", "Suzuki", "Yamaha", "Ducati"};

   /* public static void manufacturerUserInput()
    {
        Scanner readLn = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter manufacturer brand "+(i+1)+":");
            manufacturer[i] = readLn.nextLine();
        }
    }
    public static void salesUserInput()
    {
        Scanner readLn = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
               System.out.println("Enter sale for Manufacturer "+manufacturer[i]+" in quarter "+j);
            sales[i][j] = Double.parseDouble(readLn.nextLine()); 
            }
            
        }
    }*/
    public static double TotalSales(int ManufacturerIndex) {
        double totalSales = 0;

        /*for (double sale : sales[manufacturer]) {
            totalSales += sale;
        }*/
        for (int i = 0; i < sales[ManufacturerIndex].length; i++) {
            totalSales += sales[ManufacturerIndex][i];
        }

        return totalSales;
    }

    public static String ManufacturerStaus(int ManufacturerIndex) {
        double total = TotalSales(ManufacturerIndex);
        if (total >= 300) {
            return "Gold";
        } else {
            return "Silver";
        }
    }

    public static String PrintSales() {
        String output = "";

        output += String.format("%-20s%-20s%-20s%-20s%-20s%-20s","Brand","Quarter 1","Quarter 2","Quarter 3","Total","Status") ;
        output += "\n-------------------------------------------------------------------------------------------------------------------";
        for (int i = 0; i < sales.length; i++) {
            String Sales = "";

            for (int j = 0; j < sales[i].length; j++) {
                Sales +=  String.format("%-20s", sales[i][j]);
            }
            output += String.format("\n%-20s%-20s%-20s%-20s" , manufacturer[i] ,Sales 
                  , TotalSales(i), ManufacturerStaus(i));

        }
        return output;
    }

}
