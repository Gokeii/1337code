package com.gokeii.algorithms.hard.mergeKSortedLists;

import org.junit.Assert;
import org.junit.Test;

public class MergeKSortedListsTest {

    @Test
    public void test() {
        MergeKSortedLists solution = new MergeKSortedLists();

        ListNode[] a = new ListNode[5];
        a[0] = new ListNode(2);
        a[1] = new ListNode(3);
        a[1].next = new ListNode(6);
        a[2] = new ListNode(1);
        a[3] = new ListNode(4);
        a[3].next = new ListNode(7);
        a[4] = new ListNode(5);

        Assert.assertEquals(1, solution.mergeKLists(a).val);
        Assert.assertEquals(2, solution.mergeKLists(a).next.val);
        Assert.assertEquals(3, solution.mergeKLists(a).next.next.val);
        Assert.assertEquals(4, solution.mergeKLists(a).next.next.next.val);
        Assert.assertEquals(5, solution.mergeKLists(a).next.next.next.next.val);
        Assert.assertEquals(6, solution.mergeKLists(a).next.next.next.next.next.val);
        Assert.assertEquals(7, solution.mergeKLists(a).next.next.next.next.next.next.val);
    }

}
