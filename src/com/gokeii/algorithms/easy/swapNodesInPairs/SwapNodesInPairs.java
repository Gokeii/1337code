/******************************************************************************
 * Basic linked list operation.
 ******************************************************************************/

package com.gokeii.algorithms.easy.swapNodesInPairs;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode newHead = null;
        if (null != head && null != head.next) {
            newHead = head.next;
            ListNode tmp = head.next.next;
            newHead.next = head;
            head.next = tmp;
        } else {
            return head;
        }

        ListNode prev = newHead.next;
        ListNode current = prev.next;
        while (null != current && null != current.next) {
            // update next node of prev
            prev.next = current.next;

            // swap two nodes
            ListNode tmp = current.next.next;
            current.next.next = current;
            current.next = tmp;
            
            // iterate
            prev = current;
            current = current.next;
        }

        return newHead;
    }
}
