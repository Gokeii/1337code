package com.gokeii.algorithms.easy.excelSheetColumnTitle;

import org.junit.Assert;
import org.junit.Test;

public class ExcelSheetColumnTitleTest {

    @Test
    public void test() {
        ExcelSheetColumnTitle solution = new ExcelSheetColumnTitle();

        Assert.assertEquals("A", solution.convertToTitle(1));
        Assert.assertEquals("B", solution.convertToTitle(2));
        Assert.assertEquals("C", solution.convertToTitle(3));
        Assert.assertEquals("Z", solution.convertToTitle(26));
        Assert.assertEquals("AA", solution.convertToTitle(27));
        Assert.assertEquals("AB", solution.convertToTitle(28));
        Assert.assertEquals("ZA", solution.convertToTitle(677));
    }

}
