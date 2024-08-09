/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.colava to edit this template
 */
package pkg2d_array;

/**
 *
 * @author tvnmt
 */
import java.awt.DisplayMode;
import java.util.Scanner;

public class NewClass {
    
public static String[] meal = {"Breakfast", "Lunch", "Dinner"};
public static String[] dayOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
 
    public static class Client{
        public static Scanner ScanLn = new Scanner(System.in);
        public String[][] MealPlan = new String[5][3];
        
        
        public void captureMealPlan() {
            for (int row = 0; row < dayOfTheWeek.length; row++) {
                for (int col = 0; col < meal.length; col++) {
                    System.out.println("enter " + dayOfTheWeek[row] + "'s " + meal[col]);
                    MealPlan[row][col] = ScanLn.next();
                }
            }
        }
        
        public void searchMealPlanItem(String search) {
            boolean found = false;
            String result = "";
            for (int row = 0;!found; row++) {
                for (int col = 0; !found; col++) {
                    
                   if (MealPlan[row][col] == search)
                   {  
                        result = "row:"+row+"col:"+col;
                        found = true;
                   }
                }
            }
            if (found) {
                System.out.println("the "+search+" was found at "+result);
            }else{ System.out.println("the "+search+" was not found ");}
             
        }
        
         public void searchDinerMealPlanItem(String search) {
            boolean found = false;
            String result = "";
            
                for (int row = 0; !found; row++) {
                    
                   if (MealPlan[row][2] == search)
                   {  
                        result = "row:"+row;
                        found = true;
                   }
                }
            
            if (found) {
                System.out.println("the "+search+" was found at "+result);
            }else{ System.out.println("the "+search+" was/were not found ");}
             
        }
        public void generateMealPlan() {
            MealPlan = new String[][]{
            {"scrambled eggs & toast", "tuna sandwich", "spaghetti bolognese"},
            {"oats", "chicken strips", "Pap & beef"},
            {"ceral", "chicken nuggets", "Pizza"},
            {"omlet", "boiled eggs sandwich", "boeboetie"},
            {"cornflakes", "burger", "umphokoqo"}};
        }
        
        public String DisplayFormatedMealPlan()
        { String Output ="";
            for (int row = 0; row < MealPlan.length; row++) {
                  Output +=  dayOfTheWeek[row]+": ";
                for (int col = 0; col < MealPlan[row].length; col++) {
                    //System.out.printf("%-30s %s",meal[col], MealPlan[row][col] );
                    Output += ("\n "+String.format("%-10s %-2s %-10s",meal[col],": ", MealPlan[row][col]));  
                }
                  Output += "\n";
            }
            return Output ;
        }
        
        public String DisplayMealPlan(){  
        String Output ="";
        //System.out.println("%s %.1f %.1f%n",meal[0],meal[0],meal[0]); 
            for (int row = 0; row < MealPlan.length; row++) {
                Output+= dayOfTheWeek[row]+":\n\t";
                for (int col = 0; col < MealPlan[row].length; col++) {
                    Output += meal[col]+": "+MealPlan[row][col]+"\t\t";
                }
                Output+="\n";
            }

        return Output;
        }
                  // two Dimentional array 
       
    }

     public static void displayDayOfWeekArray() {
       
        String Output = "";
        for (String day : dayOfTheWeek) {
            Output += day + "\n";
        }
        System.out.println(Output);
        //JOptionPane.showMessageDialog(null, Output);
    }
    public static void main(String[] args) {
       /* Client newClient = new Client();
        //newClient.captureMealPlan();
        newClient.generateMealPlan();
        System.out.println(newClient.DisplayFormatedMealPlan());
        //System.out.println(newClient.DisplayMealPlan());*/
       displayDayOfWeekArray();
    }
    
   
}

/*
public String captureEmail (){
        String email="";
        boolean validEmail = false;
        
        while(!validEmail)
        {
            System.out.println("Enter your email address");
            if (email.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$")) {
                validEmail = true;
            } else{System.out.println("try again");}
        }
        
        return "";
    } */