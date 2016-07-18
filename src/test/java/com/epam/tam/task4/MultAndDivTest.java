package com.epam.tam.task4;

import org.testng.Assert;
import org.testng.annotations.*;

public class MultAndDivTest extends BaseCalculatorTest {

    @Test(groups = "div")
    public void divDoubleTest() {
        double result = calculator.div(3.0, 2.0);
        Assert.assertEquals(result, 1.5, "Invalid result of operation");
    }
    //correct for Java but incorrect for logic
    @Test(groups = "div")
    public void divLongTest() {
        long result = calculator.div(3, 2);
        Assert.assertEquals(result, 2, "Invalid result of operation");
    }

    @Test(groups = "mult")
    public void multLongTest() {
        long result = calculator.mult(2, 2);
        Assert.assertEquals(result, 4, "Invalid result of multiplication for Long numbers");
    }

    //incorrect multiplication for Long values
    @Test(groups = "mult")
    public void multDoubleTest() {
        double result = calculator.mult(2.2, 2.0);
        Assert.assertEquals(result, 4.2, "Invalid result of multiplication for Long numbers");
    }

    //should throw exception
    @Test(groups = "div")
    public void checkDivisionByZeroThrowsException() {
        calculator.div(3.0, 0.0);
    }

    @Test(expectedExceptions = NumberFormatException.class, groups = "div")
    public void divByZeroLongTest() {
        calculator.div(2, 0);
    }
}
