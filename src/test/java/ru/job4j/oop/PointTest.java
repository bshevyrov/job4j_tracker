package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when333To333Then0() {
        int x1 = 3;
        int y1 = 3;
        int z1 = 3;
        int x2 = 3;
        int y2 = 3;
        int z2 = 3;

        Point pointA = new Point(x1, y1, z1);
        Point pointB = new Point(x2, y2, z2);
        double rsl = pointA.distance3d(pointB);
        double expected = 0;
        Assert.assertEquals(expected, rsl, 0.0001);
    }

    @Test
    public void when0Minus33To313Then5() {
        int x1 = 0;
        int y1 = -3;
        int z1 = 3;
        int x2 = 3;
        int y2 = 1;
        int z2 = 3;

        Point pointA = new Point(x1, y1, z1);
        Point pointB = new Point(x2, y2, z2);
        double rsl = pointA.distance3d(pointB);
        double expected = 5;
        Assert.assertEquals(expected, rsl, 0.0001);
    }

    @Test
    public void when303To003Then3() {
        int x1 = 3;
        int y1 = 0;
        int z1 = 3;
        int x2 = 0;
        int y2 = 0;
        int z2 = 3;

        Point pointA = new Point(x1, y1, z1);
        Point pointB = new Point(x2, y2, z2);
        double rsl = pointA.distance3d(pointB);
        double expected = 3;
        Assert.assertEquals(expected, rsl, 0.0001);
    }
}