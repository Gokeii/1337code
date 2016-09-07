package com.gokeii.algorithms.medium.generateParentheses;

import org.junit.Test;

public class GenerateParenthesesTest {

    @Test
    public void test() {
        GenerateParentheses solution = new GenerateParentheses();

        System.out.println(solution.generateParenthesis(1));
        System.out.println(solution.generateParenthesis(2));
        System.out.println(solution.generateParenthesis(3));
    }

}
