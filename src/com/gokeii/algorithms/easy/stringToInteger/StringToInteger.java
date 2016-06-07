/******************************************************************************
 * pay attention to all possible input:
 *  1. non-numeric character
 *  2. integer overflow or downflow
 *  3. sign of integer
 *  4. remove all leading or trailing white spaces
 ******************************************************************************/

package com.gokeii.algorithms.easy.stringToInteger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToInteger {
    public int myAtoi(String str) {
        str = str.trim();
        int value = 0;
        Pattern p = Pattern.compile("[+-]?\\d+");
        Matcher m = p.matcher(str);
        
        if (m.find() && m.start() == 0) {
            str = str.substring(m.start(), m.end());
            try {
                value = Integer.parseInt(str);
           } catch (NumberFormatException e) {
               if (str.charAt(0) == '-') {
                   value = Integer.MIN_VALUE;
               } else {
                   value = Integer.MAX_VALUE;
               }
           }
        }
        
        return value;
    }
}
