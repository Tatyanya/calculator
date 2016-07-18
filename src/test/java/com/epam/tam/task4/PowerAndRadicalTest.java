package com.epam.tam.task4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PowerAndRadicalTest extends BaseCalculatorTest {

    @Test
    public void powTest() {
        double result = calculator.pow(3, 2);
        Assert.assertEquals(result, 9.0, "Invalid result of operation");
    }

    @Test
    public void sqrtTest() {
        double result = calculator.sqrt(16);
        Assert.assertEquals(result, 4.0, "Invalid result of operation");
    }

    @Test
    public void sqrtNegativeTest() {
        double result = calculator.sqrt(-16);
        Assert.assertEquals(result, 4.0, "Invalid result of operation");
    }
}
