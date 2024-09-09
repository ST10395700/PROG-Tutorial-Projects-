/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapeproject_interface_inheritance_overload;

/**
 *
 * @author tvnmt
 */
 public class Quadrilateral extends Shape implements Shape.areaCalc, Shape.sidesTotal {

        public int shapeNumSides = 0;

        @Override
        public double totalSides() {

            return 5;
        }

        public Quadrilateral(int[] newDimensions, String myShapeName) {
            super(newDimensions, myShapeName);
            shapeNumSides = newDimensions.length;
            Type = "Quadrilateral";

        }

        @Override
        public double CalcArea() {
            //Parallelogram Square Rectangle
            int area = this.Dimensions[0] * this.Dimensions[2];

            return area;
        }

        public double CalcArea(int diagonal1, int diagonal2) {
            //Rhombus

            int area = (diagonal1 * diagonal2) / 2;

            return area;
        }

        public double CalcArea(double heght) {
            //Trapezium
            double area = (this.Dimensions[0] + this.Dimensions[2]) * heght / 2;

            return area;
        }
    }
