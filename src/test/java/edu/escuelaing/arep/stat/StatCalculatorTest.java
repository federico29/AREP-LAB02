/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.stat;

import edu.escuelaing.arep.util.MyLinkedList;
import junit.framework.TestCase;

/**
 *
 * @author Federico Barrios Meneses
 */
public class StatCalculatorTest extends TestCase {
 private MyLinkedList<Double> column1 = new MyLinkedList<>();
    private MyLinkedList<Double> column2 = new MyLinkedList<>();
    
    public StatCalculatorTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        column1.add(160.0);
        column1.add(591.0);
        column1.add(114.0);
        column1.add(229.0);
        column1.add(230.0);
        column1.add(270.0);
        column1.add(128.0);
        column1.add(1657.0);
        column1.add(624.0);
        column1.add(1503.0);
        
        column2.add(15.0);
        column2.add(69.9);
        column2.add(6.5);
        column2.add(22.4);
        column2.add(28.4);
        column2.add(65.9);
        column2.add(19.4);
        column2.add(198.7);
        column2.add(38.8);
        column2.add(138.2);
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of mean method, of class StatCalculator.
     */
    public void testMeanColumn1() {
        Double expResult = 550.6;
        Double result = Math.round(StatCalculator.mean(column1)*100.0)/100.0;
        assertEquals(expResult, result);
    }

    /**
     * Test of mean method, of class StatCalculator.
     */
    public void testMeanColumn2() {
        Double expResult = 60.32;
        Double result = Math.round(StatCalculator.mean(column2)*100.0)/100.0;
        assertEquals(expResult, result);
    }
    
    /**
     * Test of standardDeviation method, of class StatCalculator.
     */
    public void testStandardDeviationColumn1() {
        Double expResult = 572.03;
        Double result = Math.round(StatCalculator.standardDeviation(column1)*100.0)/100.0;
        assertEquals(expResult, result);
    }
    
    /**
     * Test of standardDeviation method, of class StatCalculator.
     */
    public void testStandardDeviationColumn2() {
        Double expResult = 62.26;
        Double result = Math.round(StatCalculator.standardDeviation(column2)*100.0)/100.0;
        assertEquals(expResult, result);
    }
}
