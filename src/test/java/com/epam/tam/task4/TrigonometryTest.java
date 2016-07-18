package com.epam.tam.task4;

        import org.testng.Assert;
        import org.testng.annotations.Test;

public class TrigonometryTest extends BaseCalculatorTest {

    @Test
    public void tg45Test() {
        double result = calculator.tg(45);
        Assert.assertEquals(result, 1.0, "Invalid result of operation of tg caculation");
    }

/*
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void tg90Test() {
        calculator.tg(90);
    }
*/

    @Test
    public void ctg45Test() {
        double result = calculator.ctg(45);
        Assert.assertEquals(result, 1.0, "Invalid result of operation of ctg caculation");
    }
/*    @Test(expectedExceptions = IllegalArgumentException.class)
    public void ctg0Test(){
        calculator.ctg(0);
    }


/*    @Test
    public void cos0Test() {
        double result = calculator.cos(0);
        Assert.assertEquals(result, 1.0, "Invalid result of operation of cos caculation");
    }*/

    @Test
    public void sin30Test() {
        double result = calculator.sin(30);
        Assert.assertEquals(result, 0.5, "Invalid result of operation of sin caculation");
    }

}