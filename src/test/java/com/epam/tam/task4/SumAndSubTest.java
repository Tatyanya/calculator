package com.epam.tam.task4;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SumAndSubTest extends BaseCalculatorTest {


    @Test
    public void sumDoubleTest() {
        double result = calculator.sum(1.1, 2.2);
        Assert.assertEquals(result, 3.3, "Invalid result of summation for Double Numbers");
    }

    @Test(dataProvider = "DPPosSum", groups = "positive")
    public void positiveSumLongTest(long a, long b, long res) {
        long result = calculator.sum(a, b);
        Assert.assertSame(result, res, "Invalid result of positive summation for Long Numbers");
    }

    @Test(dataProvider = "DPNegSum",  groups = "negative")
    public void negativeSumLongTest(long a, long b, long res) {
        long result = calculator.sum(a, b);
        Assert.assertNotSame(result, res, "Invalid result of negative summation for Long Numbers");
    }

    @DataProvider(name = "DPPosSum")
    public Object[][] getValuesSum() {
        return new Object[][]{
                {-7, -2, -9},
                {-7, 1, -6},
                {0, -1, -1}
        };
    }

    @DataProvider(name = "DPNegSum")
    public Object[][] getNegValuesSum() {
        return new Object[][]{
                {-7, -2, 5},
                {-7, 1, 8},
                {0, -1, 1}
        };
    }


    @Test
    public void subDoubleTest() {
        double result = calculator.sub(5.5, 2.2);
        Assert.assertEquals(result, 3.3, "Invalid result of subtraction for Double Numbers");
    }


    @Test(dataProvider = "DPPosSub",  groups = "positive")
    public void positiveSubLongTest(long a, long b, long res) {
        long result = calculator.sub(a, b);
        Assert.assertSame(result, res, "Invalid result of positive subtraction for Long Numbers");
    }

    @Test(dataProvider = "DPNegSub",  groups = "negative")
    public void negativeSubLongTest(long a, long b, long res) {
        long result = calculator.sub(a, b);
        Assert.assertNotSame(result, res, "Invalid result of negative subtraction for Long Numbers");
    }

    @DataProvider(name = "DPPosSub")
    public Object[][] getValuesSub() {
        return new Object[][]{
                {-7, -2, -5},
                {-7, 1, -8},
                {0, -1, 1}
        };
    }

    @DataProvider(name = "DPNegSub")
    public Object[][] getNegValuesSub() {
        return new Object[][]{
                {-7, -2, 5},
                {-7, 1, 8},
                {0, -1, -1}
        };
    }
}