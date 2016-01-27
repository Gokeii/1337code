package com.gokeii.algorithms.easy.containsDuplicate;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicateTest {

    @Test
    public void test() {
        ContainsDuplicate solution = new ContainsDuplicate();

        int[] nums = { 8, 3, 1, 4, 2, 7, 5, 4, 6 };
        Assert.assertEquals(true, solution.containsDuplicate(nums));
        
        nums = new int[] { 1, 2, 3, 4, 5, 6 };
        Assert.assertEquals(false, solution.containsDuplicate(nums));

        BufferedReader testcase;
        try {
            testcase = new BufferedReader(new FileReader("src/com/gokeii/algorithms/easy/containsDuplicate/testcase.txt"));
            String[] numbers = testcase.readLine().split(",");
            nums = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                nums[i] = Integer.parseInt(numbers[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Assert.assertEquals(false, solution.containsDuplicate(nums));
    }

}
