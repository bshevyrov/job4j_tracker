package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenSecondMaxFromThree() {
        int first = 9;
        int second = 18;
        int third = 0;

        Max max = new Max();
        int rsl = max.max(first, second, third);
        int expected = 18;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenThirdMaxFromThree() {
        int first = 9;
        int second = 8;
        int third = 10;
        Max max = new Max();
        int rsl = max.max(first, second, third);
        int expected = 10;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenFirstMaxFromThree() {
        int first = 9;
        int second = 8;
        int third = 0;

        Max max = new Max();
        int rsl = max.max(first, second, third);
        int expected = 9;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenFourthMaxFromFour() {
        int first = 9;
        int second = 8;
        int third = 0;
        int fourth = 11;

        Max max = new Max();
        int rsl = max.max(first, second, third, fourth);
        int expected = 11;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenThirdMaxFromFour() {
        int first = -9;
        int second = -8;
        int third = 0;
        int fourth = -1;

        Max max = new Max();
        int rsl = max.max(first, second, third, fourth);
        int expected = 0;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenSecondMaxFromFour() {
        int first = 9;
        int second = 18;
        int third = 0;
        int fourth = 0;

        Max max = new Max();
        int rsl = max.max(first, second, third, fourth);
        int expected = 18;
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenFirstMaxFromFour() {
        int first = 9;
        int second = 8;
        int third = 0;
        int fourth = 1;

        Max max = new Max();
        int rsl = max.max(first, second, third, fourth);
        int expected = 9;
        Assert.assertEquals(expected, rsl);
    }
}