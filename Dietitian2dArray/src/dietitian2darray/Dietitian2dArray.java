/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dietitian2darray;

/**
 *
 * @author tvnmt
 */
import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import static Dietitian2dArray.Dietitian2dArray.Client.*;

public class Dietitian2dArray {

    public static String[] meal = {"Breakfast", "Lunch", "Dinner"};
    public static String[] dayOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

   

    public static void displayDayOfWeekArray() {

        String Output = "";
        for (String day : dayOfTheWeek) {
            Output += day + "\n";
        }
        System.out.println(Output);
        //JOptionPane.showMessageDialog(null, Output);
    }

    public static void main(String[] args) {

        Client newClient = new Client();
        String newStrint = "string";
        Client.registerClient();
        Client.validateAge(0);
        //newClient.captureMealPlan();
        newClient.generateMealPlan();
        newClient.searchMealPlanItem("oats");
        Client.searchClient();
        
        //System.out.println(newClient.DisplayFormatedMealPlan());
        //System.out.println(newClient.DisplayMealPlan());*/
        //displayDayOfWeekArray();
    }

}
