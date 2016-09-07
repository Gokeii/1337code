package com.gokeii.algorithms.easy.mergeTwoSortedLists;

import org.junit.Assert;
import org.junit.Test;

public class MergeTwoSortedListsTest {

    @Test
    public void test() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        
        ListNode l1 = new ListNode(1);

        ListNode l2 = new ListNode(2);

        Assert.assertEquals(1, solution.mergeTwoLists(l1, l2).val);;
        Assert.assertEquals(2, solution.mergeTwoLists(l1, l2).next.val);;
    }

}
