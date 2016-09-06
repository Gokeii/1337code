/******************************************************************************
 * Take first string as initial longest common prefix.
 * Incrementally shorten the string by comparing it to each remaining strings.
 ******************************************************************************/

package com.gokeii.algorithms.easy.longestCommonPrefix;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String lcp = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String current = strs[i];
            int j = 0;
            while (j < lcp.length() && j < current.length()
                    && lcp.charAt(j) == current.charAt(j))
                j++;
            lcp = lcp.substring(0, j);
        }

        return lcp;
    }
}
