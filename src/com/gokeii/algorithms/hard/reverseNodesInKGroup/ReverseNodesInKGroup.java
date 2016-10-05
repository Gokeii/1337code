/******************************************************************************
 * Basic linked list operation.
 ******************************************************************************/

package com.gokeii.algorithms.hard.reverseNodesInKGroup;

public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode newHead = null;
        if (kthNode(head, k) != null) {
            newHead = reverseKNodes(head, k);
        } else {
            return head;
        }

        ListNode prev = head;
        ListNode current = prev.next;
        while (kthNode(current, k) != null) {
            prev.next = reverseKNodes(current, k);

            // iterate
            prev = kthNode(prev.next, k);
            current = prev.next;
        }

        return newHead;
    }

    public ListNode reverseKNodes(ListNode head, int k) {
        ListNode first = kthNode(head, k);

        ListNode prev = first.next;
        ListNode current = head;
        int i = 0;
        while (i < k) {
            ListNode tmp = current.next;
            current.next = prev;
            prev = current;
            current = tmp;
            i++;
        }

        return first;
    }

    public ListNode kthNode(ListNode head, int k) {
        ListNode current = head;
        int i = 1;
        while (i < k) {
            if (current != null) {
                current = current.next;
                i++;
            } else {
                return null;
            }
        }

        return current;
    }
}
