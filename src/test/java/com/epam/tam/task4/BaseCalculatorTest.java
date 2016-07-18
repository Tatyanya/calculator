package com.epam.tam.task4;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.Date;

import com.epam.tat.module4.Calculator;

public class BaseCalculatorTest {
    protected Calculator calculator;

    BaseCalculatorTest(){
        calculator = new Calculator();
    }

    @BeforeClass
    public void bc() {
        System.out.println("Before class");
    }

    @AfterClass
    public void ac() {
        System.out.println("After class");
    }

    protected void checkTime() {
        System.out.println("Current time: " + new Date(System.currentTimeMillis()));
    }
} 