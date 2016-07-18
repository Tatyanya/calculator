package com.epam.tam.task4;

import org.testng.Assert;
import org.testng.annotations.*;

    public class MultAndDivTest extends BaseCalculatorTest {

    @Test(groups = "div")
    public void divOneValueByAnother() {
        double result = calculator.div(3D, 2D);
        Assert.assertEquals(result, 1.5D, "Invalid result of operation");
        }

    @Test(groups = "mult")
    public void multLongTest() {
        long result = calculator.mult(2, 2);
        Assert.assertEquals(result, 4, "Invalid result of multiplication for Long numbers");
    }

/*    @Test(groups = "div", expectedExceptions = IllegalArgumentException.class)
    public void checkDivisionByZeroThrowsException() {
        calculator.div(3D, 0D);

    }*/

    @Test(expectedExceptions = NumberFormatException.class, groups = "div")
    public void divByZeroLongTest() {
        calculator.div(2, 0);
    }
}
