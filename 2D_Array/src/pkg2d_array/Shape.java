/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2d_array;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tvnmt
 */
public class Shape {

    public Shape(int[] dimensions,String newShapeName) {
      shapeName = newShapeName  ;
      shapeSideDimension = dimensions;
     // shapeArea = CalcArea();  
    }

    public static List<Shape> myShapes = new ArrayList<>();
    
    public String shapeType = "";
    public String shapeName = "";
    public int shapeNumSides = 0;
    public int[] shapeSideDimension;
    public int shapeArea;
    
    // public int CalcArea(){};
    public static class Quadrilateral extends Shape {

        public Quadrilateral(int[] newDimensions, String myShapeName) {
            //this.shapeNumSides = 4;
            super(newDimensions, myShapeName);
            shapeNumSides = newDimensions.length;
            shapeType = "Quadrilateral";
        
        }
        // overide public int CalcArea(){};
        public static void mainMethod(String[] args) {
            int[] squreDimensions = {4, 4, 4, 4};
            int[] rectDimensions = {2, 4, 2, 4};
            Quadrilateral shape1 = new Quadrilateral(squreDimensions,"Square");
            Quadrilateral shape2 = new Quadrilateral(rectDimensions,"Rectangle");

            myShapes.add(shape1);
            myShapes.add(shape2);
        }
    }

    public static class Triangle extends Shape {

        // public Triangle(){}
        public Triangle(int[] newDimensions, String myShapeName) {
            super(newDimensions, myShapeName);
            
            this.shapeType = "Triangle";
            this.shapeNumSides = newDimensions.length;

            
        }
        // overide public int CalcArea(){};
        public static void mainMethod(String[] args) {
              int[] newShape1Dimensions = { 4, 2, 4};
              int[] newShape2Dimensions = { 3, 2, 4};
              int[] newShape3Dimensions = { 3, 3,3};
            Triangle newShape1 = new Triangle(newShape1Dimensions,"Isoscelese");
            Triangle newShape2 = new Triangle(newShape1Dimensions,"Scalene");
            Triangle newShape3 = new Triangle(newShape1Dimensions,"Equilateral");

            myShapes.add(newShape1);
            myShapes.add(newShape2);
            myShapes.add(newShape3);
        }

    }

    public static void main(String[] args) {

        Quadrilateral.mainMethod(args);
        Triangle.mainMethod(args);

        for (int shapeAtIndex = 0; shapeAtIndex < /*myShapes.lengh()*/ myShapes.size(); shapeAtIndex++) {

            System.out.println(String.format("Shape name: %-10s\tShape numSides: %-3d \t Shape type: %-15s", /*myShapes[0]*/ myShapes.get(shapeAtIndex).shapeName, myShapes.get(shapeAtIndex).shapeNumSides, myShapes.get(shapeAtIndex).shapeType));
        }
        /*
        Shape shape1 = new Shape();
        Shape shape2 = new Shape();
      
        shape2.shapeType = "Quadralateral";
        
        shape1.shapeLength = 4;
        shape1.shapeWidth = 6;
        
        shape2.shapeLength = 5;
        shape2.shapeWidth = 7;
        
        shape1.shapeType = "not a Quad"; 
        
        System.out.println(String.format("%-10s %-10s %-10s %-10s %-10s %-10s","Shape 1: Length- ",shape1.shapeLength," width- ",shape1.shapeWidth,  " Type- ",shape1.shapeType) ); 
        System.out.println(String.format("%-10s %-10s %-10s %-10s %-10s %-10s","Shape 2: Length- ",shape2.shapeLength," width- ",shape2.shapeWidth, " Type- ",shape2.shapeType) ); 
         */

    }

}
