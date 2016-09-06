package com.gokeii.algorithms.easy.longestCommonPrefix;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

    @Test
    public void test() {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        String[] strs = {};
        Assert.assertEquals("", solution.longestCommonPrefix(strs));

        strs = new String[] {"a", "b", "c"};
        Assert.assertEquals("", solution.longestCommonPrefix(strs));

        strs = new String[] {"aaa", "aab", "aac"};
        Assert.assertEquals("aa", solution.longestCommonPrefix(strs));
    }

}
