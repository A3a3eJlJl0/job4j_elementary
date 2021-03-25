package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140f;
        float expected = 2f;
        float out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenConvert180RblThen3Dollar() {
        float in = 180f;
        float expected = 3f;
        float out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenConvert0RblThen0Dollar() {
        float in = 0f;
        float expected = 0f;
        float out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0.001);
    }
}