/******************************************************************************
 * Recurrence rather than recursion.
 ******************************************************************************/

package com.gokeii.algorithms.medium.letterCombinationsOfAPhoneNumber;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        if (digits.length() == 0)
            return result;
        else
            result.add("");

        char[][] chars = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' },
                { 'g', 'h', 'i' }, { 'j', 'k', 'l' }, { 'm', 'n', 'o' },
                { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' },
                { 'w', 'x', 'y', 'z' } };

        for (int i = 0; i < digits.length(); i++) {
            int number = digits.charAt(i) - '0';
            for (int k = result.size() - 1; k >= 0; k--) {
                String current = result.get(k);
                result.remove(k);
                for (int j = 0; j < chars[number - 2].length; j++) {
                    char c = chars[number - 2][j];
                    result.add(current + c);
                }
            }
        }

        return result;
    }
}
