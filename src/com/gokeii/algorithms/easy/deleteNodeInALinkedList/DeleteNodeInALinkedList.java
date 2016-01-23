/******************************************************************************
 * Easy enough. Pay attention to the efficiency, though.
 ******************************************************************************/

package com.gokeii.algorithms.easy.deleteNodeInALinkedList;

public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        ListNode nextNode = node.next;
        node.val = nextNode.val;
        node.next = nextNode.next;
    }
}
