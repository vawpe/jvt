package ru.stqa.jft.sandbox;

import org.junit.Assert;
import org.junit.Test;

public class PointTests {

    @Test
    public void testDistance() {

        Point p1 = new Point(2,-5);
        Point p2 = new Point(-4,3);

        Assert.assertEquals(10, p1.distance(p2), 0.0);
    }
}
