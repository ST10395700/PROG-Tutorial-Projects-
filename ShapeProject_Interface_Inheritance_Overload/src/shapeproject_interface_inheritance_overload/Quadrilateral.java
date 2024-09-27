/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapeproject_interface_inheritance_overload;

/**
 *
 * @author tvnmt
 */
 public class Quadrilateral extends Shape implements Shape.iareaCalc, Shape.isidesTotal {

        public int shapeNumSides = 0;

        @Override
        public double totalSides() {

            return 4;
        }

        public Quadrilateral(int[] newDimensions, String myShapeName) {
            super(newDimensions, myShapeName);
            shapeNumSides = newDimensions.length;
            Type = "Quadrilateral";

        }

        @Override
        public double CalcArea() {
            //Parallelogram Square Rectangle
            double area = this.Dimensions[0] * this.Dimensions[1];

            return area;
        }

        public double CalcArea(double diagonal1, double diagonal2) {
            //Rhombus

            double area = (diagonal1 * diagonal2) / 2;

            return area;
        }

        public double CalcArea(double heght) {
            //Trapezium
            double area = (this.Dimensions[0] + this.Dimensions[2]) * heght / 2;

            return area;
        }
    }
