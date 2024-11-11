/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exeption_handling;

import java.util.Scanner;

/**
 *
 * @author tvnmt
 */
public class Exeption_handling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner readLn = new Scanner (System.in);
        System.out.println("Enter the numerator");
        int numerator = readLn.nextInt();
        
           System.out.println("Enter the denominator");
        int denominator = readLn.nextInt();
        
       // int num = 50;
        try {
            System.out.println("answer = "+ (numerator/denominator));
            int[] nums = {1,2,4,5};
            System.out.println(nums[6]);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }
    
}
