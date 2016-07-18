package com.epam.tam.task4;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TrigonometryTest extends BaseCalculatorTest {
    //wrong tg in calculator, actual is tanh
    @Test(dataProvider = "DPForTg")
    public void tgTest(double a, double expectedResult) {
        double result = calculator.tg(a);
        Assert.assertEquals(result, expectedResult, "Invalid result of operation of tg caculation");
    }


    @DataProvider(name = "DPForTg")
    public Object[][] dataProviderTg() {
        return new Object[][]{
                {0, 0.0},
                {Math.PI / 4, 1.0},
                {-Math.PI / 4, -1},
        };
    }

/*    @Test(expectedExceptions = IllegalArgumentException.class)
    public void ctg0Test(){
        calculator.ctg(0);
    }*/

    //wrong ctg in calculator, relates to cos
    @Test(dataProvider = "DPForCtg")
    public void testCtg(double a, double expectedResult) {
        double result = calculator.ctg(a);
        Assert.assertEquals(result, expectedResult, "Invalid result of ctg operation!");
    }

    @DataProvider(name = "DPForCtg")
    public Object[][] dataProviderCtg() {
        return new Object[][]{
                {Math.PI / 4, 1.0},
                {Math.PI / 2, 0.0},
                {-Math.PI / 4, -1.0}
        };
    }

    @Test(dataProvider = "DPForSin")
    public void testSin(double a, double expectedResult) {
        double result = calculator.sin(a);
        Assert.assertEquals(result, expectedResult, "Invalid result of sin operation!");
    }

    @DataProvider(name = "DPForSin")
    public Object[][] dataProviderSin() {
        return new Object[][]{
                {0, 0.0},
                {Math.PI / 2, 1.0},
                {Math.PI / 6, 0.5},
        };
    }

    //wrong cos in calculator, actual is sin
    @Test(dataProvider = "DPForCos")
    public void testCos(double a, double expectedResult) {
        double result = calculator.cos(a);
        Assert.assertEquals(result, expectedResult, "Invalid result of cos operation!");
    }

    @DataProvider(name = "DPForCos")
    public Object[][] dataProviderCos() {
        return new Object[][]{
                {0, 1.0},
                {Math.PI / 2, 0.0},
                {-Math.PI / 3, -0.5},
                {Math.PI, -1.0}
        };
    }
}