package com.gokeii.algorithms.easy.reverseInteger;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {

    @Test
    public void test() {
        ReverseInteger solution = new ReverseInteger();

        Assert.assertEquals(0, solution.reverse(0));
        Assert.assertEquals(1, solution.reverse(1));
        Assert.assertEquals(-1, solution.reverse(-1));
        Assert.assertEquals(321, solution.reverse(123));
        Assert.assertEquals(-321, solution.reverse(-123));
    }

}
