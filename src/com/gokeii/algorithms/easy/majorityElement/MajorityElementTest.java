package com.gokeii.algorithms.easy.majorityElement;

import org.junit.Assert;
import org.junit.Test;

public class MajorityElementTest {

    @Test
    public void test() {
        MajorityElement solution = new MajorityElement();

        int[] nums = { 1 };
        Assert.assertEquals(1, solution.majorityElement(nums));
        
        nums = new int[] { 1, 2, 3, 3, 3};
        Assert.assertEquals(3, solution.majorityElement(nums));
    }

}
