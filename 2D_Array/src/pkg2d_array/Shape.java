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

    //add enumerasion
    public Shape(int[] dimensions, String newShapeName) {
        shapeName = newShapeName;
        shapeSideDimension = dimensions;
        shapePerimeter = CalcPerimeter();
    }

    public static List<Shape> myShapes = new ArrayList<>();

    public String shapeType = "";
    public String shapeName = "";

    public int[] shapeSideDimension;
    public double shapeArea;
    public double shapePerimeter;
    
    // abstract or interface method
    public double CalcArea() {

        int area = 0;

        return area;
    }

    public double CalcPerimeter() {
        int perimeter = 0;
        for (int dimension : this.shapeSideDimension) {
            perimeter += dimension;
        }

        return perimeter;
    }

    public static class Quadrilateral extends Shape {

        public int shapeNumSides = 0;

        public Quadrilateral(int[] newDimensions, String myShapeName) {
            super(newDimensions, myShapeName);
            shapeNumSides = newDimensions.length;
            shapeType = "Quadrilateral";

        }

        @Override
        public double CalcArea() {
            //Parallelogram Square Rectangle
            int area = this.shapeSideDimension[0] * this.shapeSideDimension[2];

            return area;
        }

        public double CalcArea(int diagonal1, int diagonal2) {
            //Rhombus

            int area = (diagonal1 * diagonal2) / 2;

            return area;
        }

        
        public double CalcArea(double heght) {
            //Trapezium
            double area = (this.shapeSideDimension[0] + this.shapeSideDimension[2]) * heght / 2;

            return area;
        }

        // overide public double CalcArea(){};
        public static void mainMethod(String[] args) {
            final int[] squreDimensions = {4, 4, 4, 4};
            int[] rectDimensions = {2, 4, 2, 4};

            int[] paralleloDimensions = {2, 4, 2, 4};
            int[] rhombusDimensions = {4, 4, 4, 4};
            int[] trapDimensions = {2, 4, 6, 4};

            ArrayList<Integer> dimensions = new ArrayList<Integer>();

            Quadrilateral shape1 = new Quadrilateral(squreDimensions, "Square");
            Quadrilateral shape2 = new Quadrilateral(rectDimensions, "Rectangle");

            Quadrilateral shape3 = new Quadrilateral(paralleloDimensions, "Parallelogram");
            Quadrilateral shape4 = new Quadrilateral(rhombusDimensions, "Rhombus");
            Quadrilateral shape5 = new Quadrilateral(trapDimensions, "Trapezium");

            myShapes.add(shape1);
            myShapes.add(shape2);
        }
    }

    public static class Triangle extends Shape {

        public int shapeNumSides = 0;
      

        //public Triangle(){}
        public Triangle(int[] newDimensions, String myShapeName) {
            super(newDimensions, myShapeName);

            this.shapeType = "Triangle";
            this.shapeNumSides = newDimensions.length;
            shapeArea = CalcArea();
        }
        
        public double CalcArea(double height) {

            double area = (this.shapeSideDimension[1] *height) / 2;

            return area;
        }

        // overide public double CalcArea(){};
        public static void mainMethod(String[] args) {
            int[] newShape1Dimensions = {4, 2, 4};
            int[] newShape2Dimensions = {3, 2, 4};
            int[] newShape3Dimensions = {3, 3, 3};
            //Triangle newShape = new Triangle();
            Triangle newShape1 = new Triangle(newShape1Dimensions, "Isoscelese");
            Triangle newShape2 = new Triangle(newShape2Dimensions, "Scalene");
            Triangle newShape3 = new Triangle(newShape3Dimensions, "Equilateral");

            myShapes.add(newShape1);
            myShapes.add(newShape2);
            myShapes.add(newShape3);

        }

    }

    public static class circle extends Shape {

        @Override
        public double CalcPerimeter() {

            return (2 * Math.PI * (this.shapeSideDimension[0]));
        }
        
         @Override
        public double CalcArea() {

            return Math.pow((Math.PI*this.shapeSideDimension[0]), 2);
        }

        public circle(int[] newDimensions, String myShapeName) {
            super(newDimensions, myShapeName);
            shapeType = "Circle";
        }
    }

    public static void main(String[] args) {

        Quadrilateral.mainMethod(args);
        Triangle.mainMethod(args);

        for (int shapeAtIndex = 0; shapeAtIndex < /*myShapes.lengh()*/ myShapes.size(); shapeAtIndex++) {

            System.out.println(String.format("Shape name: %-10s\t Shape type: %-15s", /*myShapes[0]*/ myShapes.get(shapeAtIndex).shapeName, myShapes.get(shapeAtIndex).shapeType));
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
