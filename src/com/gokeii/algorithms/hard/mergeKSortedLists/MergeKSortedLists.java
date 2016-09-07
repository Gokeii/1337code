/******************************************************************************
 * Store all nodes in one list and sort the list.
 ******************************************************************************/

package com.gokeii.algorithms.hard.mergeKSortedLists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> nodes = new ArrayList<ListNode>();
        for (int i = 0; i < lists.length; i++) {
            ListNode current = lists[i];
            while (current != null) {
                nodes.add(current);
                current = current.next;
            }
        }

        Comparator<ListNode> c = new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val > o2.val ? 1 : o1.val == o2.val ? 0 : -1;
            }
        };
        nodes.sort(c);

        if (nodes.size() == 0)
            return null;

        ListNode head = new ListNode(nodes.get(0).val);
        ListNode current = head;
        for (int i = 1; i < nodes.size(); i++) {
            current.next = new ListNode(nodes.get(i).val);
            current = current.next;
        }

        return head;
    }
}
