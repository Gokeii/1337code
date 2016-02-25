/******************************************************************************
 * Find the index pattern.
 ******************************************************************************/

package com.gokeii.algorithms.easy.zigZagConversion;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        int len = s.length();
        StringBuilder result = new StringBuilder();

        // process first line
        for (int i = 1; i <= len; i += 2 * (numRows - 1)) {
            result.append(s.charAt(i - 1));
        }

        for (int i = 2; i < numRows; i++) {
            int j = i;
            boolean downward = true;
            while (j <= len) {
                result.append(s.charAt(j - 1));
                j += downward ? 2 * (numRows - i) : 2 * (i - 1);
                downward = !downward;
            }
        }

        // process last line
        if (numRows > 1) {
            for (int i = numRows; i <= len; i += 2 * (numRows - 1)) {
                result.append(s.charAt(i - 1));
            }
        }

        return result.toString();
    }
}
