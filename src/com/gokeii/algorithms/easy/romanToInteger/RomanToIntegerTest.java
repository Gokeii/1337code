package com.gokeii.algorithms.easy.romanToInteger;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {

    @Test
    public void test() {
        RomanToInteger solution = new RomanToInteger();

        Assert.assertEquals(1, solution.romanToInt("I"));
        Assert.assertEquals(2, solution.romanToInt("II"));
        Assert.assertEquals(3, solution.romanToInt("III"));
        Assert.assertEquals(4, solution.romanToInt("IV"));
        Assert.assertEquals(5, solution.romanToInt("V"));
        Assert.assertEquals(6, solution.romanToInt("VI"));
        Assert.assertEquals(7, solution.romanToInt("VII"));
        Assert.assertEquals(8, solution.romanToInt("VIII"));
        Assert.assertEquals(9, solution.romanToInt("IX"));
        Assert.assertEquals(10, solution.romanToInt("X"));
        Assert.assertEquals(11, solution.romanToInt("XI"));
        Assert.assertEquals(12, solution.romanToInt("XII"));
        
        Assert.assertEquals(1954, solution.romanToInt("MCMLIV"));
        Assert.assertEquals(1990, solution.romanToInt("MCMXC"));
        Assert.assertEquals(2014, solution.romanToInt("MMXIV"));
    }

}
