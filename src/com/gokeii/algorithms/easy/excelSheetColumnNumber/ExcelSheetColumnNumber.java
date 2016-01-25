/******************************************************************************
 * A bit like digital root(replace 1-9 with A-Z). Pay attention to the rules 
 * that title generate with. Related question: Excel Sheet Column Title.
 ******************************************************************************/

package com.gokeii.algorithms.easy.excelSheetColumnNumber;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int num = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            num = num * 26 + (current - 'A' + 1);
        }
        
        return num;
    }
}
