/******************************************************************************
 * A bit like digital root(replace 1-9 with A-Z). Pay attention to the rules 
 * that title generate with.
 ******************************************************************************/

package com.gokeii.algorithms.easy.excelSheetColumnTitle;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder title = new StringBuilder();

        while (n != 0) {
            int remainder = (n - 1) % 26;
            n = (n - 1) / 26;
            title.insert(0, (char)('A' + remainder));
        }

        return title.toString();
    }
}
