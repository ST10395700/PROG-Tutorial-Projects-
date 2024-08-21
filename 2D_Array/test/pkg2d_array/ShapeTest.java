/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pkg2d_array;

import org.junit.Test;
import static org.junit.Assert.*;
import pkg2d_array.Shape.Quadrilateral;

/**
 *
 * @author tvnmt
 */
public class ShapeTest {

    @Test
    public void testCalcArea() {
    }

    @Test
    public void testCalcPerimeter() {
        
        int[] quadDimensions = {2, 2, 2, 2};
        String myShapeName = "square";
        Quadrilateral newQuad = new Quadrilateral(quadDimensions, myShapeName);
        
        assertEquals(8, newQuad.CalcPerimeter()); 
    }

    @Test
    public void testMain() {
    }

}
