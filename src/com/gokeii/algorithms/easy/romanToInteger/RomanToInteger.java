/******************************************************************************
 * Just follow the rules of roman numerals.
 ******************************************************************************/

package com.gokeii.algorithms.easy.romanToInteger;

public class RomanToInteger {
    public int romanToInt(String s) {
        int num = 0;
        char current = 'M';
        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
            case 'M':
                if (current == 'C')
                    num += 800;
                else
                    num += 1000;
                break;
            case 'D':
                if (current == 'C')
                    num += 300;
                else 
                    num += 500;
                break;
            case 'C':
                if (current == 'X') {
                    num += 80;
                } else {
                    num += 100;
                    current = 'C';
                }
                break;
            case 'L':
                if (current == 'X')
                    num += 30;
                else
                    num += 50;
                break;
            case 'X':
                if (current == 'I') {
                    num += 8;
                } else {
                    num += 10;
                    current = 'X';
                }
                break;
            case 'V':
                if (current == 'I')
                    num += 3;
                else 
                    num += 5;
                break;
            case 'I':
                num += 1;
                current = 'I';
                break;
            }
        }
        
        return num;
    }
}
