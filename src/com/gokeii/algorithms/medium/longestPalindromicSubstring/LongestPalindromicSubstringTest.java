package com.gokeii.algorithms.medium.longestPalindromicSubstring;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromicSubstringTest {

    @Test
    public void test() {
        LongestPalindromicSubstring solution = new LongestPalindromicSubstring();

        Assert.assertEquals("a", solution.longestPalindrome("a"));
        Assert.assertEquals("anana", solution.longestPalindrome("bananas"));
    }

}
