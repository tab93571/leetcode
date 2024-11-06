package com.example.leetcode.day3;

public class Leetcode707DesignLinkedListRecursion {
    private class Node {
        int val;
        Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
        }
    }

    private int size;
    private Node head;

    public Leetcode707DesignLinkedListRecursion() {
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        return get(head, index).val;
    }

    private Node get(Node head, int index) {
        if (index == 0) {
            return head;
        }
        return get(head.next, index - 1);
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);

    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }
        head = addAtIndex(index, val, head);
        size++;
    }

    private Node addAtIndex(int index, int val, Node head) {
        if (index == 0) {
            return new Node(val, head);
        }
        head.next = addAtIndex(index - 1, val, head.next);
        return head;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        head = deleteAtIndex(index, head);
        size--;
    }

    private Node deleteAtIndex(int index, Node head) {
        if (index == 0) {
            return head.next;
        }
        head.next = deleteAtIndex(index - 1, head.next);
        return head;
    }
}
