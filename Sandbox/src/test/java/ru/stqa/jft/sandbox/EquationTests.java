package ru.stqa.jft.sandbox;

import org.junit.Assert;
import org.junit.Test;

public class EquationTests {

    @Test
    public void test0() {
        Equation e = new Equation(1,1,1);
        Assert.assertEquals(0, e.rootNumber(), 0.0);
    }

    @Test
    public void test1() {
        Equation e = new Equation(1,2,1);
        Assert.assertEquals(1, e.rootNumber(), 0.0);
    }

    @Test
    public void test2() {
        Equation e = new Equation(1,5,6);
        Assert.assertEquals(2, e.rootNumber(), 0.0);
    }

    @Test
    public void testLinear() {
        Equation e = new Equation(0,1,1);
        Assert.assertEquals(1, e.rootNumber(), 0.0);
    }

    @Test
    public void testConstant() {
        Equation e = new Equation(0,0,1);
        Assert.assertEquals(0, e.rootNumber(), 0.0);
    }

    @Test
    public void testZero() {
        Equation e = new Equation(0,0,0);
        Assert.assertEquals(-1, e.rootNumber(), 0.0);
    }
}
