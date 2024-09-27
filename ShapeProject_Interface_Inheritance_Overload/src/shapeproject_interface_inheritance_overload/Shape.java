/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapeproject_interface_inheritance_overload;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tvnmt
 */
public class Shape {

    //add enumerasion
    public Shape() {

    }

    public Shape(int[] dimensions, String newShapeName) {
        this.Name = newShapeName;
        this.Dimensions = dimensions;
    }

    public static List<Shape> myShapes = new ArrayList<>();

    public String Type = "";
    public String Name = "";

    public int[] Dimensions;

    public double Area;
    public double Perimeter;

    /*
    public dimensions[]shapeDimension;
    public static enum dimensions{Right_LENGTH,LEFT_LENGTH,Right_WIDTH,LEFT_WIDTH, HEIGHT,;
    public double dimensionSize = 0;
    }*/
    //public interface ShapesWithSides extends shape{} 
    // abstract or interface method
    interface iareaCalc {

        public double CalcArea();
    }

    interface isidesTotal {

        public double TotalSides = 0;

        public abstract double totalSides();
    }

    abstract class myClass {

        public abstract double totalSides();
        /*
        public double totalSide(double[] sides) {

            return sides.length;
        } */
    }

    public double CalcPerimeter() {
        int perimeter = 0;
        for (int dimension : this.Dimensions) {
            perimeter += dimension;
        }

        return perimeter;
    }

    public static void main(String[] args) {

        for (int indexOfShape = 0; indexOfShape < myShapes.size(); indexOfShape++) {

            System.out.println(String.format("Shape name: %-10s\t Shape type: %-15s", /*myShapes[0]*/ myShapes.get(indexOfShape).Name, myShapes.get(indexOfShape).Type));
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

//        final int[] squreDimensions = {4, 4, 4, 4};
//            int[] rectDimensions = {2, 4, 2, 4};
//
//            int[] paralleloDimensions = {2, 4, 2, 4};
//            int[] rhombusDimensions = {4, 4, 4, 4};
//            int[] trapDimensions = {2, 4, 6, 4};
//
//            ArrayList<Integer> dimensions = new ArrayList<Integer>();
//
//            Quadrilateral shape1 = new Quadrilateral(squreDimensions, "Square");
//            Quadrilateral shape2 = new Quadrilateral(rectDimensions, "Rectangle");
//
//            Quadrilateral shape3 = new Quadrilateral(paralleloDimensions, "Parallelogram");
//            Quadrilateral shape4 = new Quadrilateral(rhombusDimensions, "Rhombus");
//            Quadrilateral shape5 = new Quadrilateral(trapDimensions, "Trapezium");
//
//            myShapes.add(shape1);
//            myShapes.add(shape2);
//        }
//    }
//
//    public static class Triangle extends Shape {
//
//        public int shapeNumSides = 0;
//      
//
//        //public Triangle(){}
//        public Triangle(int[] newDimensions, String myShapeName) {
//            super(newDimensions, myShapeName);
//
//            this.shapeType = "Triangle";
//            this.shapeNumSides = newDimensions.length;
//            shapeArea = CalcArea();
//        }
//        
//        public double CalcArea(double height) {
//
//            double area = (this.shapeSideDimension[1] *height) / 2;
//
//            return area;
//        }
//
//        // overide public double CalcArea(){};
//        public static void mainMethod(String[] args) {
//            int[] newShape1Dimensions = {4, 2, 4};
//            int[] newShape2Dimensions = {3, 2, 4};
//            int[] newShape3Dimensions = {3, 3, 3};
//            //Triangle newShape = new Triangle();
//            Triangle newShape1 = new Triangle(newShape1Dimensions, "Isoscelese");
//            Triangle newShape2 = new Triangle(newShape2Dimensions, "Scalene");
//            Triangle newShape3 = new Triangle(newShape3Dimensions, "Equilateral");
//
//            myShapes.add(newShape1);
//            myShapes.add(newShape2);
//            myShapes.add(newShape3);
    }

}
