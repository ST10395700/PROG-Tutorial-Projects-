/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package shapeproject_interface_inheritance_overload;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tvnmt
 */
public class QuadrilateralTest {
    
    public QuadrilateralTest() {
    }

    @Test
    public void testTotalSides() {
        int[] dimensions = new int[] {2,4,2,4};
        Quadrilateral rectangleQuad = new Quadrilateral(dimensions, "Rectangle");
        double result = rectangleQuad.totalSides();
        double Expected = 4;
        double notExpected = 9;
        assertTrue(Expected == result);
        assertFalse(notExpected == result);

        
    }

    @Test
    public void testCalcArea_0args() {
        int[] dimensions = new int[] {2,4,2,4};
        Quadrilateral rectangleQuad = new Quadrilateral(dimensions, "Rectangle");
        double result = rectangleQuad.CalcArea();
        double Expected = 8;
        double notExpected = 9;
        assertEquals(Expected,result,0);
        assertFalse(notExpected == result);
    }

    @Test
    public void testCalcArea_int_int() {
        int[] dimensions = new int[] {2,4,2,4};
        Quadrilateral rectangleQuad = new Quadrilateral(dimensions, "Rectangle");
        double Expected = 8;
        double notExpected = 9;
        double diagonal = Math.sqrt(Math.pow(rectangleQuad.Dimensions[0],2)+ Math.pow(rectangleQuad.Dimensions[1],2));
        double result = rectangleQuad.CalcArea(diagonal,diagonal);
        assertEquals(Expected, result,2.00000000001);
        assertFalse(notExpected == result);
    }

    @Test
    public void testCalcArea_double() {
    }
    
}
