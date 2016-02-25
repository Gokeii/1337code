/******************************************************************************
 * Dynamic planning.
 ******************************************************************************/

package com.gokeii.algorithms.medium.longestPalindromicSubstring;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int len = s.length();
        int longestLen = 1;
        int longestIndex = 0;
        boolean[][] dp = new boolean[len + 1][len + 1];

        for (int i = 1; i <= len; i++) {
            dp[0][i] = true;
            dp[1][i] = true;
        }

        for (int i = 2; i <= len; i++) {
            for (int j = 1; j <= len - i + 1; j++) {
                if (dp[i - 2][j + 1] && s.charAt(j - 1) == s.charAt(j + i - 2)) {
                    dp[i][j] = true;

                    longestLen = i;
                    longestIndex = j - 1;
                }
            }
        }

        return s.substring(longestIndex, longestIndex + longestLen);
    }
}
