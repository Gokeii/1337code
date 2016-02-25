/******************************************************************************
 * Dynamic planning.
 ******************************************************************************/

package com.gokeii.algorithms.medium.longestSubstringWithoutRepeatingCharacters;

import java.util.ArrayList;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (null == s || "".equalsIgnoreCase(s)) {
            return 0;
        }

        ArrayList<Character> uniqueChars = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < uniqueChars.size(); j++) {
                if (s.charAt(i) == uniqueChars.get(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                uniqueChars.add(s.charAt(i));
            }
        }

        int len = s.length();
        int maxLen = 0;
        int maxSubstringLen = uniqueChars.size();
        int[][] dp = new int[maxSubstringLen + 1][len + 1];

        for (int i = 1; i <= maxSubstringLen; i++) {
            for (int j = 1; j <= len - i + 1; j++) {
                if (dp[i - 1][j] == -1) {
                    dp[i][j] = -1;
                    continue;
                }

                // notice: index of s starts from 0.
                char newChar = s.charAt(j + i - 2);
                boolean repeated = false;
                for (int k = j; k < j + i - 1; k++) {
                    if (s.charAt(k - 1) == newChar) {
                        repeated = true;
                        break;
                    }
                }
                dp[i][j] = repeated ? -1 : dp[i - 1][j] + 1;

                if (dp[i][j] > maxLen) {
                    maxLen = dp[i][j];
                }
            }
        }

        return maxLen;
    }
}
