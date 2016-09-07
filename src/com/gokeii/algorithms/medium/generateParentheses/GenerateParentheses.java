/******************************************************************************
 * Recurrence.
 * 
 * Divide each possible combination into two parts: inside a pair of parentheses
 * and outside this pair of parentheses. Looks like below:
 * (inside)outside
 * 
 * So all combinations are composed of cartesian product of possible 
 * combinations of 'inside' part and possible combinations of 'outside' part.
 * Notice that 'inside' part is inside a pair of parentheses, so we've already 
 * used a pair of parentheses.
 * 
 * Recurrence relations:
 * f(0) = "" = 1
 * f(1) = f(0) * f(0) = 1
 * f(2) = f(0) * f(1) + f(1) * f(0) = 2
 * f(3) = f(0) * f(2) + f(1) * f(1) + f(2) * f(0) = 5
 * ...
 * 
 * Take f(3) as example, 'inside' part may be composed of 0, 1 or 2 pairs of 
 * parentheses, and correspondingly 'outside' part is 2, 1, or 0 pairs of 
 * parentheses.
 ******************************************************************************/

package com.gokeii.algorithms.medium.generateParentheses;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        ArrayList<ArrayList<String>> a = new ArrayList<ArrayList<String>>();

        ArrayList<String> initial = new ArrayList<String>();
        initial.add("");
        a.add(initial);
        
        for (int i = 1; i <= n; i++) {
            ArrayList<String> current = new ArrayList<String>();
            for (int j = 0; j < i; j++) {
                ArrayList<String> inParenthese = a.get(j);
                ArrayList<String> outParenthese = a.get(i - 1 - j);

                for (int k = 0; k < inParenthese.size(); k++)
                    for (int l = 0; l < outParenthese.size(); l++)
                        current.add("(" + inParenthese.get(k) + ")" + outParenthese.get(l));
            }

            a.add(current);
        }

        return a.get(n);
    }
}
