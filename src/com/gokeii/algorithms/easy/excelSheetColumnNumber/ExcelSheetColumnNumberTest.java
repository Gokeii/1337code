package com.gokeii.algorithms.easy.excelSheetColumnNumber;

import org.junit.Assert;
import org.junit.Test;

public class ExcelSheetColumnNumberTest {

    @Test
    public void test() {
        ExcelSheetColumnNumber solution = new ExcelSheetColumnNumber();

        Assert.assertEquals(1, solution.titleToNumber("A"));
        Assert.assertEquals(2, solution.titleToNumber("B"));
        Assert.assertEquals(3, solution.titleToNumber("C"));
        Assert.assertEquals(26, solution.titleToNumber("Z"));
        Assert.assertEquals(27, solution.titleToNumber("AA"));
        Assert.assertEquals(28, solution.titleToNumber("AB"));
        Assert.assertEquals(677, solution.titleToNumber("ZA"));
    }

}
