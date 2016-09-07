/******************************************************************************
 * No algorithm.
 ******************************************************************************/

package com.gokeii.algorithms.easy.mergeTwoSortedLists;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;

        ListNode head = new ListNode(0);
        ListNode current = head, p1 = l1, p2 = l2;
        while (p1 != null || p2 != null) {
            if (p2 == null || p1 != null && p1.val < p2.val) {
                current.val = p1.val;
                p1 = p1.next;
            } else {
                current.val = p2.val;
                p2 = p2.next;
            }

            if (p1 != null || p2 != null) {
                ListNode prev = current;
                current = new ListNode(0);
                prev.next = current;
            }
        }

        return head;
    }
}
