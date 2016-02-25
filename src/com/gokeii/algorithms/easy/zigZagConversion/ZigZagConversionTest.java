package com.gokeii.algorithms.easy.zigZagConversion;

import org.junit.Assert;
import org.junit.Test;

public class ZigZagConversionTest {

    @Test
    public void test() {
        ZigZagConversion solution = new ZigZagConversion();

        Assert.assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3));
        Assert.assertEquals("PINALSIGYAHRPI", solution.convert("PAYPALISHIRING", 4));
        Assert.assertEquals("PHASIYIRPLIGAN", solution.convert("PAYPALISHIRING", 5));
        Assert.assertEquals("A", solution.convert("A", 1));
    }

}
