/******************************************************************************
 * Use hash map to quickly retrieve element.
 * Use doubly linked list to update recent usage.
 ******************************************************************************/
package com.gokeii.algorithms.hard.lruCache;

import java.util.HashMap;

public class LRUCache {
    HashMap<Integer, Node> map;
    DoublyLinkedList list;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<Integer, Node>(capacity);
        list = new DoublyLinkedList();
    }

    public int get(int key) {
        Node node = map.get(key);
        if (null == node)
            return -1;

        node.prev.next = node.next;
        node.next.prev = node.prev;
        list.append(node);

        return node.value;
    }

    public void set(int key, int value) {
        if (map.containsKey(key)) {
            map.get(key).value = value;
            get(key);
            return;
        } else if (map.size() == capacity) {
            Node node = list.deleteLast();
            map.remove(node.key);
        }

        Node node = new Node(key, value);
        list.append(node);
        map.put(key, node);
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList() {
        head = new Node();
        tail = new Node();
    }

    public void append(Node node) {
        if (null == head.next || null == tail.prev) {
            head.next = node;
            tail.prev = node;
            node.prev = head;
            node.next = tail;
        } else {
            Node first = head.next;
            head.next = node;
            first.prev = node;
            node.prev = head;
            node.next = first;
        }
    }

    public Node deleteLast() {
        Node last = tail.prev;
        if (last.prev == head) {
            tail.prev = null;
            head.next = null;
        } else {
            last.prev.next = tail;
            tail.prev = last.prev;
        }
        last.prev = null;
        last.next = null;

        return last;
    }
}

class Node {
    int key;
    int value;
    Node prev;
    Node next;

    public Node() {
        this.prev = null;
        this.next = null;
    }

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;
    }
}