package com.gokeii.algorithms.easy.palindromeNumber;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {

    @Test
    public void test() {
        PalindromeNumber solution = new PalindromeNumber();

        Assert.assertEquals(true, solution.isPalindrome(0));
        Assert.assertEquals(true, solution.isPalindrome(1));
        Assert.assertEquals(false, solution.isPalindrome(12));
        Assert.assertEquals(true, solution.isPalindrome(121));
        Assert.assertEquals(false, solution.isPalindrome(-2147483648));
    }

}
