/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapeproject_interface_inheritance_overload;

/**
 *
 * @author tvnmt
 */
   public  class Circle extends Shape implements Shape.iareaCalc {

        @Override
        public double CalcPerimeter() {

            return (2 * Math.PI * (this.Dimensions[0]));
        }

        @Override
        public double CalcArea() {

            return Math.pow((Math.PI * this.Dimensions[0]), 2);
        }

        public Circle(int[] newDimensions, String myShapeName) {
            super(newDimensions, myShapeName);
            Type = "Circle";
        }
    }
