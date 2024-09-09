/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2d_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author tvnmt
 */
public class Main {

    public static String[][] Timetable = new String[5][8];
    public static int[] period = {1, 2, 3, 4, 5, 6, 7, 8}; // set array size;
    public static String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
    public static Scanner ScanLn = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // dispalyDayOfWeekArray(dayOfWeek);
        //generateTimeTable();
        //System.out.println(Timetable.length);
        //nesstedForLoop();
        //captureTimeTable();
        //displayTimetableArray();

        TimeTableClass.mainMethod();
    }

    public static int markLevel(int mark) {
        if (mark >= 75) {
            return 1;
        } else if (mark >= 50) {
            return 2;
        } else if (mark >= 40) {
            return 3;
        } else {
            return 4;
        }
    }

    public static Enum gradeMark(int mark) {
            enum Grade {
                DISTICTION, PASS, CONDONED, FAIL
            }

            Grade myGrade;

            switch (markLevel(mark)) {
                case (1):
                    myGrade = Grade.DISTICTION;
                case (2):
                    myGrade = Grade.PASS;
                case (3):
                    myGrade = Grade.CONDONED;
                default:
                    myGrade = Grade.FAIL;
            }
            return myGrade;
        }

        public static void createTimetable() {
            //JOptionPane.show
        }

        public static void generateTimeTable() {
            Timetable = new String[][]{{"PROG", "PROG", "NWEG", "NWEG", "ITPP", "ITPP", "FREE", "FREE"},
            {"FREE", "FREE", "FREE", "FREE", "PROG", "PROG", "PRSE", "PRSE"},
            {"FREE", "FREE", "NWEG", "NWEG", "ITPP", "ITPP", "PROG", "PROG"},
            {"FREE", "FREE", "PRSE", "PRSE", "PROG", "PROG", "FREE", "FREE"},
            {"PRSE", "PRSE", "NWEG", "NWEG", "FREE", "FREE", "FREE", "FREE"}
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
                    Output += period + "\t";
                }
                Output += "\n";
            }
            System.out.println(Output);
            // JOptionPane.showMessageDialog(null, Output);

        }

        public void nesstedForLoop() {
            for (int x = 0; x < 10; x++) {
                System.out.println("outter loop count: " + x);
                for (int y = 0; y < 10; y++) {
                    System.out.println("\tinner loop count: " + y);
                }
            }
        }

        public static class TimeTableClass extends Main {

            public static List<List<String>> TimetableArray = new ArrayList<>();

            // public static ArrayList<ArrayList<String>> Timetable = new ArrayList<>();
            public static List<String> dayOfWeekArray = new ArrayList<>();
            public static List<Integer> periodArray = new ArrayList<>();

            enum Subject {
                PROG, NWEG, ITPP, PRSE, FREE
            }

            public static void mainMethod() {
                populateDayOfTheWeekArray();
                populatePeriodArray();
                generateTimeTableArrayList();
                displayTimetableArray();

                TimeTableClass newClass = new TimeTableClass();
                newClass.nesstedForLoop();
            }

            public static void populateDayOfTheWeekArray() {
                for (String dayOfWeekName : dayOfWeek) {
                    dayOfWeekArray.add(dayOfWeekName);
                }
            }

            public static void populatePeriodArray() {
                for (int periodNum : period) {
                    periodArray.add(periodNum);
                }

            }

            public static void captureTimeTable() {
                for (int i = 0; i < dayOfWeekArray.size(); i++) {
                    for (int j = 0; j < periodArray.size(); j++) {
                        System.out.println("Enter module for " + dayOfWeekArray.get(i) + " period " + periodArray.get(j));
                        Timetable[i][j] = ScanLn.nextLine();
                    }
                }
                displayTimetableArray();
            }

            public static void generateTimeTableArrayList() {

                TimetableArray.add(Arrays.asList("PROG", "PROG", "NWEG", "NWEG", "ITPP", "ITPP", "FREE", "FREE"));
                TimetableArray.add(Arrays.asList("FREE", "FREE", "FREE", "FREE", "PROG", "PROG", "PRSE", "PRSE"));
                TimetableArray.add(Arrays.asList("FREE", "FREE", "NWEG", "NWEG", "ITPP", "ITPP", "PROG", "PROG"));
                TimetableArray.add(Arrays.asList("FREE", "FREE", "PRSE", "PRSE", "PROG", "PROG", "FREE", "FREE"));
                TimetableArray.add(Arrays.asList("PRSE", "PRSE", "NWEG", "NWEG", "FREE", "FREE", "FREE", "FREE"));

            }

            public static void displayTimetableArray() {
                StringBuilder output = new StringBuilder();
                // String Output = "";
                int count = 0;
                for (List<String> day : TimetableArray) {
                    //Output += String.format("%-10s:", dayOfWeekArray.get(count));
                    output.append(String.format("%-10s:", dayOfWeekArray.get(count)));
                    for (String period : day) {
                        output.append(String.format("%-5s", period));
                        //Output +=String.format("%-5s", period);
                    }
                    output.append("\n");
                    count++;
                }
                System.out.println(output);
            }
        }

    }
