package com.gokeii.algorithms.easy.removeNthNodeFromEndOfList;

import org.junit.Assert;
import org.junit.Test;

public class RemoveNthNodeFromEndOfListTest {

    @Test
    public void test() {
        RemoveNthNodeFromEndOfList solution = new RemoveNthNodeFromEndOfList();
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        Assert.assertEquals(5, solution.removeNthFromEnd(head, 2).next.next.next.val);
        
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        Assert.assertEquals(2, solution.removeNthFromEnd(head, 5).val);
    }

}
