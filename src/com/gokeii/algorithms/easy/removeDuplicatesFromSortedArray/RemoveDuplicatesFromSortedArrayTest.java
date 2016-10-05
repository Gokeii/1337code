package com.gokeii.algorithms.easy.removeDuplicatesFromSortedArray;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void test() {
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

        int[] nums = new int[] { 1, 1, 2 };
        Assert.assertEquals(2, solution.removeDuplicates(nums));
        Assert.assertEquals(1, nums[0]);
        Assert.assertEquals(2, nums[1]);
    }
}
