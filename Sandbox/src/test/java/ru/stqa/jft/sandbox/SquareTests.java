package ru.stqa.jft.sandbox;

import org.junit.Assert;
import org.junit.Test;

public class SquareTests {

    @Test
    public void testArea() {

        Square s = new Square(5);
        Assert.assertEquals(25, s.area(), 0.01);
    }
}
