/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapeproject_interface_inheritance_overload;

/**
 *
 * @author tvnmt
 */
 public  class Triangle extends Shape {

        public int shapeNumSides = 0;

        public Triangle() {
        }

        public Triangle(int[] newDimensions, String myShapeName) {
            super(newDimensions, myShapeName);

            this.Type = "Triangle";
            this.shapeNumSides = newDimensions.length;
            Area = CalcArea(4);
        }

        public double CalcArea(double height) {

            double area = (this.Dimensions[1] * height) / 2;

            return area;
        }
    }
