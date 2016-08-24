package com.gokeii.algorithms.medium.longestIncreasingSubsequence;

import org.junit.Assert;
import org.junit.Test;

public class LongestIncreasingSubsequenceTest {

    @Test
    public void test() {
        LongestIncreasingSubsequence solution = new LongestIncreasingSubsequence();

        int[] height = new int[] {10, 9, 2, 5, 3, 7, 101, 18};
        Assert.assertEquals(4, solution.lengthOfLIS(height));
    }

}
