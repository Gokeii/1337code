/******************************************************************************
 * High accuracy addition with linked list.
 ******************************************************************************/

package com.gokeii.algorithms.medium.addTwoNumbers;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode(0);
        
        ListNode current = sum;
        ListNode currentL1 = l1;
        ListNode currentL2 = l2;
        while (null != currentL1 || null != currentL2) {
            if (null != currentL1 && null != currentL2) {
                current.val = currentL1.val + currentL2.val;
            } else if (null != currentL1) {
                current.val = currentL1.val;
            } else {
                current.val = currentL2.val;
            }
            
            if ((null != currentL1 && null != currentL1.next) || (null != currentL2 && null != currentL2.next)) {
                current.next = new ListNode(0);
            }
            current = current.next;
            if (null != currentL1) {
                currentL1 = currentL1.next;
            }
            if (null != currentL2) {
                currentL2 = currentL2.next;
            }
        }

        current = sum;
        while (null != current) {
            int carry = current.val / 10;
            if (0 != carry) {
                if (null != current.next) {
                    current.next.val += carry;
                } else {
                    current.next = new ListNode(carry);
                }
            }
            current.val %= 10;
            
            current = current.next;
        }
        
        return sum;
    }
}
