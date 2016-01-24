/******************************************************************************
 * Use map to adapt to characters of any kinds of code page.
 ******************************************************************************/

package com.gokeii.algorithms.easy.validAnagram;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (null == s && null == t) {
            return true;
        } else if (null == s || null == t || s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            Integer currentValue = sMap.get(currentChar);
            sMap.put(currentChar, currentValue == null ? 1 : currentValue + 1);
        }
        HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();
        for (int i = 0; i < t.length(); i++) {
            char currentChar = t.charAt(i);
            Integer currentValue = tMap.get(currentChar);
            tMap.put(currentChar, currentValue == null ? 1 : currentValue + 1);
        }

        for (Character key : sMap.keySet()) {
            Integer sInt = sMap.get(key);
            Integer tInt = tMap.get(key);
            int sValue = sInt == null? 0 : sInt.intValue();
            int tValue = tInt == null? 0 : tInt.intValue();
            if (sValue != tValue) {
                return false;
            }
        }
        return true;
    }
}
