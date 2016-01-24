/******************************************************************************
 * Variant of bubble sort.
 ******************************************************************************/

package com.gokeii.algorithms.easy.moveZeroes;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int head = 0;
        int tail = 1;
        while (tail < nums.length && head < nums.length) {
            while (head < nums.length && nums[head] != 0) {
                head++;
            }
            tail = head + 1;
            while (tail < nums.length && nums[tail] == 0) {
                tail++;
            }

            if (tail < nums.length && head < nums.length) {
                nums[head] = nums[tail];
                nums[tail] = 0;
            }
        }
    }
}
