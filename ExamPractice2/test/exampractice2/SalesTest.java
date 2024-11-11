/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package exampractice2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tvnmt
 */
public class SalesTest {

    public SalesTest() {
    }

    @Test
    public void testManufacturerUserInput() {
    }

    @Test
    public void testSalesUserInput() {
    }

    @Test
    public void testTotalSales() {
        double ExpectedResult = 350;
        double ExpectedFalseResult = 35;
        double ActualResult = Sales.TotalSales(1);
        assertEquals(ExpectedResult, ActualResult, 0.01);
        assertFalse(ExpectedFalseResult == ActualResult);
    }

    @Test
    public void testManufacturerStaus() {
        String ExpectedResult = "Silver";
        String ExpectedFalseResult = "Gold";
        
        String ActualResult = Sales.ManufacturerStaus(3);
         assertEquals(ExpectedResult, ActualResult);
        assertFalse(ExpectedFalseResult == ActualResult);
    }

    @Test
    public void testPrintSales() {
    }

}
