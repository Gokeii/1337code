/******************************************************************************
 * Hash the distribution of array and done.
 ******************************************************************************/

package com.gokeii.algorithms.easy.majorityElement;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int threshold = nums.length / 2;
        
        for (int i = 0; i < nums.length; i++) {
            Integer times = map.get(nums[i]);
            map.put(nums[i], null == times? 1 : times + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > threshold) {
                return entry.getKey();
            }
        }
        
        return 0;
    }
}
