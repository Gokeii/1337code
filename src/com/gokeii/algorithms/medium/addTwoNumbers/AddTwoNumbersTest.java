package com.gokeii.algorithms.medium.addTwoNumbers;

import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {

    @Test
    public void test() {
        AddTwoNumbers solution = new AddTwoNumbers();

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Assert.assertEquals(7, solution.addTwoNumbers(l1, l2).val);
        Assert.assertEquals(0, solution.addTwoNumbers(l1, l2).next.val);
        Assert.assertEquals(8, solution.addTwoNumbers(l1, l2).next.next.val);
        
        l2.next.next.val = 6;
        Assert.assertEquals(7, solution.addTwoNumbers(l1, l2).val);
        Assert.assertEquals(0, solution.addTwoNumbers(l1, l2).next.val);
        Assert.assertEquals(0, solution.addTwoNumbers(l1, l2).next.next.val);
        Assert.assertEquals(1, solution.addTwoNumbers(l1, l2).next.next.next.val);

        l1 = new ListNode(9);
        l1.next = new ListNode(8);
        l2 = new ListNode(1);
        Assert.assertEquals(0, solution.addTwoNumbers(l1, l2).val);
        Assert.assertEquals(9, solution.addTwoNumbers(l1, l2).next.val);
    }

}
