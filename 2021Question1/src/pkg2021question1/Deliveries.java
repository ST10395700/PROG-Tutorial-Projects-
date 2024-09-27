/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2021question1;

/**
 *
 * @author tvnmt
 */
public class Deliveries {
    static String[] Months = {"Jan","Feb","Mar","Apr"};
    static String[] DeliveryYears = {"Deliveries 2018","Deliveries 2019","Deliveries 2020"};
    
    static int[][] DeliveriesY = new int[][]{{128,135,139},{155,129,175},{129,130,185}};
    
    
    static int[][] DeliveriesM = new int[][]{{128,155,129},{135,129,130},{139,175,185}};

// Option A {{128,135,139,000},{155,129,175,000},{129,130,185,000}}
    // Option B {{128,135,139},{155,129,175},{129,130,185},{000,000,000}}

    public static void calcTotalForEachMonth()
    {
        
        System.out.println("Calculating total for each month:\n***********************************");
        System.out.println("DeliveriesY Array:\n***********************************");
        for (int i = 0; i < 3; i++) {
            int TotalDY = 0;
        
            for (int row = 0; row < 3; row++) {
                System.out.println("\t"+TotalDY+" + "+DeliveriesY[row][i]);
                TotalDY+= DeliveriesY[row][i];
            }
            System.out.println("Total for month :"+Months[i]+" = "+ TotalDY);
        }
        System.out.println("DeliveriesM Array:\n***********************************");
        for (int i = 0; i < 3; i++) {
            int TotalDM = 0;
            for (int col = 0; col < 3; col++) {
                System.out.println("\t"+TotalDM+" + "+DeliveriesY[i][col]);
                TotalDM+= DeliveriesM[i][col];
            } 
            
            System.out.println("Total for month :"+Months[i]+" = "+ TotalDM);
        }

       
        //System.out.println("total for each month ");
    }
    
    public static void calcTotalForEachyear()
    {

        System.out.println("Calculating total for each year:\n***********************************");
        System.out.println("DeliveriesY Array:\n***********************************");
        for (int i = 0; i < 3; i++) {
            int TotalDY = 0;
            for (int col = 0; col < 3; col++) {
               
                System.out.println("\t"+TotalDY+" + "+DeliveriesY[i][col]);
                TotalDY+= DeliveriesY[i][col];
            }
            System.out.println("Total for Year :"+DeliveryYears[i]+" = "+ TotalDY);
        }
        
        System.out.println("DeliveriesM Array:\n***********************************");
        for (int i = 0; i < 3; i++) {
            int TotalDM = 0;
            for (int row = 0; row < 3; row++) {
                System.out.println("\t"+TotalDM+" + "+DeliveriesY[row][i]);
                TotalDM+= DeliveriesM[row][i];
            } 
            
            System.out.println("Total for Year :"+DeliveryYears[i]+" = "+ TotalDM);
        }      

    }
    public static void MaxValue()
    { String maxIndex = "[0][0]";
        int maxValue = DeliveriesY[0][0];
        for (int i = 0; i < DeliveriesY.length ; i++) {
            for (int j = 0; j < DeliveriesY[i].length ; j++) {
                System.out.println(" is current cell:"+DeliveriesY[i][j]+" greater than 150?");
                
                if (DeliveriesY[i][j] > 150) {
                    System.out.println("\tTrue");
                    DeliveriesY [i][j] =0;
                    System.out.println("\t\tcurrent cell =0");
                } else {
                    System.out.println("\tFale");}
                
            }
        }
    }
    public static void main(String[] args) {
//        System.out.println(DeliveriesY[3][0]);
  //      System.out.println(DeliveriesM[3][0]);
    
    //calcTotalForEachMonth();
    //calcTotalForEachyear();
    MaxValue();
    }
}
