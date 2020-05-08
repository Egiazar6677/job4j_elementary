package ru.job4j.ru.job4j.calculator;

import org.junit.Assert;

import org.junit.Test;

public class FitTest {


    @Test
    public void whenman183Then95() {
        double in = 183;
        double expected = 95.45;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenwoman160Then57() {
        double in = 160;
        double expected = 57.5;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }
}