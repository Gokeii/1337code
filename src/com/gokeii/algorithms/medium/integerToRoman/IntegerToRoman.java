/******************************************************************************
 * Just follow the rules of roman numerals.
 ******************************************************************************/

package com.gokeii.algorithms.medium.integerToRoman;

public class IntegerToRoman {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();

        while (num != 0) {
            int times;
            if ((times = num / 1000) != 0) {
                sb.append(new String(new char[times]).replace('\0', 'M'));
                num %= 1000;
            } else if (num % 500 / 100 == 4) {
                sb.append('C');
                num += 100;
            } else if ((times = num / 500) != 0) {
                sb.append(new String(new char[times]).replace('\0', 'D'));
                num %= 500;
            } else if ((times = num / 100) != 0) {
                sb.append(new String(new char[times]).replace('\0', 'C'));
                num %= 100;
            } else if (num % 50 / 10 == 4) {
                sb.append('X');
                num += 10;
            } else if ((times = num / 50) != 0) {
                sb.append(new String(new char[times]).replace('\0', 'L'));
                num %= 50;
            } else if ((times = num / 10) != 0) {
                sb.append(new String(new char[times]).replace('\0', 'X'));
                num %= 10;
            } else if (num % 5 == 4) {
                sb.append('I');
                num += 1;
            } else if ((times = num / 5) != 0) {
                sb.append(new String(new char[times]).replace('\0', 'V'));
                num %= 5;
            } else {
                sb.append(new String(new char[num]).replace('\0', 'I'));
                num %= 1;
            }
        }

        return sb.toString();
    }
}
