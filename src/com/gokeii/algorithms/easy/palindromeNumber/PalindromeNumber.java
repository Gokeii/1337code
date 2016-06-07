/******************************************************************************
 * reversed integer should be the same as original integer.
 * here I use StringBuilder instead of StringBuffer to save some time.
 ******************************************************************************/

package com.gokeii.algorithms.easy.palindromeNumber;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        StringBuilder s = new StringBuilder("" + x);
        int reversed = 0;
        try {
            reversed = Integer.parseInt(s.reverse().toString());
        } catch (NumberFormatException e) {
        }

        return reversed == x;
    }
}
