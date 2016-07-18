package com.epam.tam.task4;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import org.testng.Assert;
import static com.epam.tat.module4.Timeout.sleep;


public class PositiveNegativeTest extends BaseCalculatorTest {
    private long value;
    private boolean expectedPositiveValue;
    private boolean expectedNegativeValue;

    @Factory(dataProvider = "values")
    public PositiveNegativeTest(long value, boolean expectedPositiveValue, boolean expectedNegativeValue) {
        this.value = value;
        this.expectedNegativeValue = expectedNegativeValue;
        this.expectedPositiveValue = expectedPositiveValue;
    }

    @Test
    public void checkValuePositive() {
        sleep(1);
        checkTime();
        Assert.assertTrue(calculator.isPositive(value) == expectedPositiveValue,
                "Incorrect verification of positive value");
    }

    @Test
    public void checkValueNegative() {
        sleep(1);
        checkTime();
        Assert.assertTrue(calculator.isNegative(value) == expectedNegativeValue,
                "Incorrect verification of negative value");
    }

    @DataProvider(name = "values")
    public static Object[][] valuesForCheck() {
        return new Object[][] { { 1, true, false },
                                { -1, false, true },
                                { 1000, true, false },
                                { -1000, false, true },
                                { 0, false, false } };
    }
}