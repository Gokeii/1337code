/******************************************************************************
 * Plain search.
 ******************************************************************************/

package com.gokeii.algorithms.medium.twoSum;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (null != indexMap.get(target - nums[i])) {
                return new int[] { indexMap.get(target - nums[i]), i + 1 };
            }
            indexMap.put(nums[i], i + 1);
        }

        return null;
    }
}
