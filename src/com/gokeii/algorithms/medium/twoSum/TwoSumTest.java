package com.gokeii.algorithms.medium.twoSum;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void test() {
        TwoSum solution = new TwoSum();

        int[] nums = { 2, 7, 11, 15 };
        Assert.assertArrayEquals(new int[] { 1, 2 }, solution.twoSum(nums, 9));

        nums = new int[] { 2, 3, 4, 5 };
        Assert.assertArrayEquals(new int[] { 1, 3 }, solution.twoSum(nums, 6));
    }

}
