package com.gokeii.algorithms.easy.swapNodesInPairs;

import org.junit.Assert;
import org.junit.Test;

public class SwapNodesInPairsTest {

    @Test
    public void test() {
        SwapNodesInPairs solution = new SwapNodesInPairs();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode newHead = solution.swapPairs(head);
        Assert.assertEquals(2, newHead.val);
        Assert.assertEquals(1, newHead.next.val);
        Assert.assertEquals(4, newHead.next.next.val);
        Assert.assertEquals(3, newHead.next.next.next.val);

        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        newHead = solution.swapPairs(head);
        Assert.assertEquals(2, newHead.val);
        Assert.assertEquals(1, newHead.next.val);
        Assert.assertEquals(3, newHead.next.next.val);

        head = new ListNode(1);

        newHead = solution.swapPairs(head);
        Assert.assertEquals(1, newHead.val);
    }

}
