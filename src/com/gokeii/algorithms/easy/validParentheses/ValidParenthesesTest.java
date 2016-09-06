package com.gokeii.algorithms.easy.validParentheses;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

    @Test
    public void test() {
        ValidParentheses solution = new ValidParentheses();

        Assert.assertEquals(true, solution.isValid("()"));
        Assert.assertEquals(true, solution.isValid("()[]{}"));
        Assert.assertEquals(false, solution.isValid("(]"));
        Assert.assertEquals(false, solution.isValid("([)]"));
        Assert.assertEquals(true, solution.isValid("([]{[]})"));

        Assert.assertEquals(false, solution.isValid("("));
        Assert.assertEquals(false, solution.isValid(")"));
    }

}
