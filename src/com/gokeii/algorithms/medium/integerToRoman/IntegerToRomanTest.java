package com.gokeii.algorithms.medium.integerToRoman;

import org.junit.Assert;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void test() {
        IntegerToRoman solution = new IntegerToRoman();

        Assert.assertEquals("I", solution.intToRoman(1));
        Assert.assertEquals("II", solution.intToRoman(2));
        Assert.assertEquals("III", solution.intToRoman(3));
        Assert.assertEquals("IV", solution.intToRoman(4));
        Assert.assertEquals("V", solution.intToRoman(5));
        Assert.assertEquals("VI", solution.intToRoman(6));
        Assert.assertEquals("VII", solution.intToRoman(7));
        Assert.assertEquals("VIII", solution.intToRoman(8));
        Assert.assertEquals("IX", solution.intToRoman(9));
        Assert.assertEquals("X", solution.intToRoman(10));
        Assert.assertEquals("XI", solution.intToRoman(11));
        Assert.assertEquals("XII", solution.intToRoman(12));
        
        Assert.assertEquals("MCMLIV", solution.intToRoman(1954));
        Assert.assertEquals("MCMXC", solution.intToRoman(1990));
        Assert.assertEquals("MMXIV", solution.intToRoman(2014));
    }

}
