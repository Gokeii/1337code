/******************************************************************************
 * n * lg n solution.
 * Dynamic planning with binary search.
 ******************************************************************************/

package com.gokeii.algorithms.medium.longestIncreasingSubsequence;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int n = nums.length;
        int[] dp = new int[n];
        
        dp[0] = nums[0];
        int len = 1;
        
        int head, mid, tail;
        for (int i = 1; i < n; i++) {
            head = 0; 
            tail = len - 1;
            
            while (head <= tail) {
                mid = (head + tail) / 2;
                if (dp[mid] < nums[i]) {
                    head = mid + 1;
                } else {
                    tail = mid - 1;
                }
            }
            
            dp[head] = nums[i];
            if (head + 1 > len) len++;
        }
        
        return len;
    }
}
