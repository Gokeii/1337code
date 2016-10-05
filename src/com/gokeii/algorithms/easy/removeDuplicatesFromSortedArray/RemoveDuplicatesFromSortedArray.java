/******************************************************************************
 * If you need hints for this one, maybe you should consider change a job...
 ******************************************************************************/

package com.gokeii.algorithms.easy.removeDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[i - count] = nums[i];
            } else {
                count++;
            }
        }
        
        return nums.length - count;
    }
}
