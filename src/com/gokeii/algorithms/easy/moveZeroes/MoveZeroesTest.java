package com.gokeii.algorithms.easy.moveZeroes;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroesTest {

    @Test
    public void test() {
        MoveZeroes solution = new MoveZeroes();

        int[] nums = { 0, 1, 0, 3, 12 };

        solution.moveZeroes(nums);
        Assert.assertEquals(1, nums[0]);
        Assert.assertEquals(3, nums[1]);
        Assert.assertEquals(12, nums[2]);
        Assert.assertEquals(0, nums[3]);
        Assert.assertEquals(0, nums[4]);

        nums = new int[] { 4, 2, 4, 0, 0, 3, 0, 5, 1, 0 };
        solution.moveZeroes(nums);
        Assert.assertEquals(4, nums[0]);
        Assert.assertEquals(2, nums[1]);
        Assert.assertEquals(4, nums[2]);
        Assert.assertEquals(3, nums[3]);
        Assert.assertEquals(5, nums[4]);
        Assert.assertEquals(1, nums[5]);
        Assert.assertEquals(0, nums[6]);
        Assert.assertEquals(0, nums[7]);
        Assert.assertEquals(0, nums[8]);
        Assert.assertEquals(0, nums[9]);
    }
}
