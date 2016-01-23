package com.gokeii.algorithms.easy.deleteNodeInALinkedList;

import org.junit.Assert;
import org.junit.Test;

public class DeleteNodeInALinkedListTest {

    @Test
    public void test() {
        DeleteNodeInALinkedList solution = new DeleteNodeInALinkedList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        solution.deleteNode(head.next.next);
        Assert.assertEquals(4, head.next.next.val);
    }

}
