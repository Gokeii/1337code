/******************************************************************************
 * Use quick and slow pointer.
 * Quick pointer moves n - 1 steps in advance. And then slow pointer moves
 * with quick pointer in the same pace. When quick pointer reaches the end 
 * of linked list, slow pointer reaches the target node.
 ******************************************************************************/

package com.gokeii.algorithms.easy.removeNthNodeFromEndOfList;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode quick = head;
        for (int i = 1; i < n; i++)
            quick = quick.next;

        ListNode slow = head;
        ListNode prev = head;
        while (quick.next != null) {
            prev = slow;
            slow = slow.next;
            quick = quick.next;
        }
        
        if (slow == head) {
            head = slow.next;
        } else {
            prev.next = slow.next;
        }
        
        return head;
    }
}
