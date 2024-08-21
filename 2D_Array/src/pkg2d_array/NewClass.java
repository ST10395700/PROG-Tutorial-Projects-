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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static pkg2d_array.NewClass.Client.*;

public class NewClass {

    public static String[] meal = {"Breakfast", "Lunch", "Dinner"};
    public static String[] dayOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

    public static class Client {

        public static List<Client> myClients = new ArrayList<>();
        public static List<Integer> numClients = new ArrayList<>();
        public static Scanner ScanLn = new Scanner(System.in);

        public String clientName = "";
        public double clientCurrentWeight = 0;
        public double clientStartingWeight = 0;
        public double clientWeightGoal = 0;
        public int clientAge = 0;
        public String[][] MealPlan = new String[5][3];

        public Client() {

        }

        public String[] ClientNames() {
            String[] myClientNames = new String[myClients.size()];
            int count = 0;
            for (Client client : myClients) {
                myClientNames[count] = client.clientName;
                count++;
            }
            int num = myClientNames.length;
            return myClientNames;
        }

        public Client(String Name, double weight, double weightGoal, int age) {
            clientName = Name;
            clientWeightGoal = weightGoal;
            clientCurrentWeight = weight;
            clientStartingWeight = weight;
            while (!validateAge(age)) {
                captureAge();
            }
            clientAge = age;
        }

        public String captureAge() {
            System.out.println("Enter age");
            return ScanLn.next();
        }

        public String captureWeightGoal() {
            System.out.println("Enter weight goal");
            return ScanLn.next();
        }

        public static Client registerClient() {

            System.out.println("Enter Name");
            String Name = ScanLn.next();
            System.out.println("Enter weight");
            String weight = ScanLn.next();

            Client defaultClient = new Client();
            String weightGoal = defaultClient.captureWeightGoal();
            String age = defaultClient.captureAge();

            int clientAge = Integer.parseInt(age);

            while (!validateAge(clientAge)) {
                System.out.println("Enter age");
                clientAge = Integer.parseInt(ScanLn.next());
            }

            Double currentWeight = Double.parseDouble(weightGoal);
            Double weightG = Double.parseDouble(weight);

            Client myClient = new Client(Name, currentWeight, weightG, clientAge);

            return myClient;
        }

        public static boolean validateAge(int age) {
            //  boolean result =false; if (age>=18 && age<=30 ) { result = true;}
            return (age >= 18 && age <= 30); //result ;
        }

        public void captureMealPlan() {
            for (int row = 0; row < dayOfTheWeek.length; row++) {
                for (int col = 0; col < meal.length; col++) {
                    System.out.println("enter " + dayOfTheWeek[row] + "'s " + meal[col]);
                    MealPlan[row][col] = ScanLn.next();
                }
            }
        }

        public static void searchClient() {
            System.out.print("Enter client name to search: ");
            String clientName = ScanLn.nextLine();

            Client foundClient = findClient(clientName);
            if (foundClient == null) {
                System.out.println("Client not found.");
            } else {
                System.out.println("Client found:");
            }
        }

        public static Client findClient(String name) {
            for (Client client : myClients) {
                if (name.equals(client.clientName)) {
                    return client;
                }
            }
            return null;
        }

        public void searchMealPlanItem(String search) {
            boolean found = false;
            String result = "";
            for (int row = 0; !found; row++) {
                for (int col = 0; !found; col++) {

                    if (MealPlan[row][col] == search) {
                        result = " row:" + row + " col:" + col;
                        found = true;
                    }
                    if (col == MealPlan[row].length - 1) {
                        break;
                    }

                }

                if (row == MealPlan.length - 1) {
                    break;
                }
            }
            if (found) {
                System.out.println("the " + search + " was found at " + result);
            } else {
                System.out.println("the " + search + " was not found ");
            }

        }

        public void searchDinerMealPlanItem(String search) {
            boolean found = false;
            String result = "";

            for (int row = 0; !found; row++) {

                if (MealPlan[row][2] == search) {
                    result = "row:" + row;
                    found = true;
                }
            }

            if (found) {
                System.out.println("the " + search + " was found at " + result);
            } else {
                System.out.println("the " + search + " was/were not found ");
            }

        }

        public void generateMealPlan() {
            MealPlan = new String[][]{
                {"scrambled eggs & toast", "tuna sandwich", "spaghetti bolognese"},
                {"oats", "chicken strips", "Pap & beef"},
                {"ceral", "chicken nuggets", "Pizza"},
                {"omlet", "boiled eggs sandwich", "boeboetie"},
                {"cornflakes", "burger", "umphokoqo"}};
        }

        public String DisplayFormatedMealPlan() {
            String Output = "";
            for (int row = 0; row < MealPlan.length; row++) {
                Output += dayOfTheWeek[row] + ": ";
                for (int col = 0; col < MealPlan[row].length; col++) {
                    //System.out.printf("%-30s %s",meal[col], MealPlan[row][col] );
                    Output += ("\n " + String.format("%-10s %-2s %-10s", meal[col], ": ", MealPlan[row][col]));
                }
                Output += "\n";
            }
            return Output;
        }

        public String DisplayMealPlan() {
            String Output = "";
            //System.out.println("%s %.1f %.1f%n",meal[0],meal[0],meal[0]); 
            for (int row = 0; row < MealPlan.length; row++) {
                Output += dayOfTheWeek[row] + ":\n\t";
                for (int col = 0; col < MealPlan[row].length; col++) {
                    Output += meal[col] + ": " + MealPlan[row][col] + "\t\t";
                }
                Output += "\n";
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

        Client newClient = new Client();
        String newStrint = "string";
        registerClient();
        validateAge(0);
        //newClient.captureMealPlan();
        newClient.generateMealPlan();
        newClient.searchMealPlanItem("oats");
        //System.out.println(newClient.DisplayFormatedMealPlan());
        //System.out.println(newClient.DisplayMealPlan());*/
        //displayDayOfWeekArray();
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
