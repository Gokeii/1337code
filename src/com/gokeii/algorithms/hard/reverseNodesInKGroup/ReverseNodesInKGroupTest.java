package com.gokeii.algorithms.hard.reverseNodesInKGroup;

import org.junit.Assert;
import org.junit.Test;

public class ReverseNodesInKGroupTest {

    @Test
    public void test() {
        ReverseNodesInKGroup solution = new ReverseNodesInKGroup();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode newHead = solution.reverseKGroup(head, 2);
        Assert.assertEquals(2, newHead.val);
        Assert.assertEquals(1, newHead.next.val);
        Assert.assertEquals(4, newHead.next.next.val);
        Assert.assertEquals(3, newHead.next.next.next.val);

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        newHead = solution.reverseKGroup(head, 2);
        Assert.assertEquals(2, newHead.val);
        Assert.assertEquals(1, newHead.next.val);
        Assert.assertEquals(3, newHead.next.next.val);

        head = new ListNode(1);

        newHead = solution.reverseKGroup(head, 2);
        Assert.assertEquals(1, newHead.val);

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        newHead = solution.reverseKGroup(head, 2);
        Assert.assertEquals(2, newHead.val);
        Assert.assertEquals(1, newHead.next.val);
        Assert.assertEquals(4, newHead.next.next.val);
        Assert.assertEquals(3, newHead.next.next.next.val);
        Assert.assertEquals(5, newHead.next.next.next.next.val);

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        newHead = solution.reverseKGroup(head, 3);
        Assert.assertEquals(3, newHead.val);
        Assert.assertEquals(2, newHead.next.val);
        Assert.assertEquals(1, newHead.next.next.val);
        Assert.assertEquals(4, newHead.next.next.next.val);
        Assert.assertEquals(5, newHead.next.next.next.next.val);
    }

}
