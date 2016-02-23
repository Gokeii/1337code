package com.gokeii.algorithms.medium.longestSubstringWithoutRepeatingCharacters;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void test() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

        Assert.assertEquals(0, solution.lengthOfLongestSubstring(""));
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        Assert.assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

}
