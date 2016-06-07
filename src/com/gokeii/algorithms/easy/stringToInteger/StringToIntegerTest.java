package com.gokeii.algorithms.easy.stringToInteger;

import org.junit.Assert;

import org.junit.Test;

public class StringToIntegerTest {

    @Test
    public void test() {
        StringToInteger solution = new StringToInteger();

        Assert.assertEquals(1, solution.myAtoi("1"));
        Assert.assertEquals(1, solution.myAtoi("+1"));
        Assert.assertEquals(-1, solution.myAtoi("-1"));
        Assert.assertEquals(0, solution.myAtoi("+-1"));
        Assert.assertEquals(1, solution.myAtoi("    1"));
        Assert.assertEquals(1, solution.myAtoi("    01"));
        Assert.assertEquals(-1, solution.myAtoi("    -01"));
        Assert.assertEquals(-1, solution.myAtoi("    -01aa"));
        Assert.assertEquals(2147483647, solution.myAtoi("2147483648"));
        Assert.assertEquals(0, solution.myAtoi("a"));
    }

}
