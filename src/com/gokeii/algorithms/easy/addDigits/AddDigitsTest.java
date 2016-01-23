package com.gokeii.algorithms.easy.addDigits;

import org.junit.Assert;

import org.junit.Test;

public class AddDigitsTest {

    @Test
    public void test() {
        AddDigits solution = new AddDigits();
        Assert.assertEquals(9, solution.addDigits(9));
        Assert.assertEquals(1, solution.addDigits(10));
        Assert.assertEquals(2, solution.addDigits(11));
        Assert.assertEquals(3, solution.addDigits(12));
        Assert.assertEquals(4, solution.addDigits(13));
        Assert.assertEquals(2, solution.addDigits(38));
        Assert.assertEquals(4, solution.addDigits(148));
    }

}
