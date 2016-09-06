/******************************************************************************
 * Use stack to match parentheses.
 * Pay attention to empty stack.
 ******************************************************************************/

package com.gokeii.algorithms.easy.validParentheses;

import java.util.EmptyStackException;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                char top;
                try {
                    top = stack.pop();
                } catch (EmptyStackException e) {
                    return false;
                }

                switch (c) {
                case ')':
                    if (top != '(')
                        return false;
                    break;
                case ']':
                    if (top != '[')
                        return false;
                    break;
                case '}':
                    if (top != '{')
                        return false;
                    break;
                }
            }
        }

        if (stack.isEmpty())
            return true;
        else
            return false;
    }
}
