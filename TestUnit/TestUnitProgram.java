/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import javafxskeleton.FirstStageController;

/**
 *
 * @author J393552
 */
public class TestUnitProgram {
    
    public TestUnitProgram() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCalculateResult() {
        Double days = 4.0;
        Double carMoney = 36.0;
        Double petrolFullPrice = 25.0;
        Double calcResult = (days * carMoney) + petrolFullPrice;
        String actual = FirstStageController.rentCalc(days, carMoney, petrolFullPrice);
        String expected = "$ 169.00";
        assertEquals(expected, actual);
    }
    
    @Test
    public void testCalculatePetrol() {
        int actual = FirstStageController.petrolCal(8, 3);
        int expected = 24;
        assertEquals(expected, actual);
        
        actual = FirstStageController.petrolCal(12, 3);
        expected = 36;
        assertEquals(expected, actual);
        
        actual = FirstStageController.petrolCal(13, 3);
        expected = 39;
        assertEquals(expected, actual);
    }
}
