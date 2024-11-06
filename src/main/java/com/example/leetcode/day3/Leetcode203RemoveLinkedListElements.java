package com.example.leetcode.day3;

public class Leetcode203RemoveLinkedListElements {
    //loop
//    public ListNode removeElements(ListNode head, int val) {
//        ListNode dummy = new ListNode(-1, head);
//        ListNode prev = dummy;
//
//        while (prev.next != null) {
//            if (prev.next.val == val) {
//                prev.next = prev.next.next;
//            } else {
//                prev = prev.next;
//            }
//        }
//        return dummy.next;
//    }
    //recursion
//    public ListNode removeElements(ListNode head, int val) {
//        if (head == null) {
//            return null;
//        }
//        head.next = removeElements(head.next, val);
//        return head.val == val ? head.next : head;
//    }

    //no dummy head
    // if we don't use dummy head, we need to find prev
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val){
            head = head.next;
        }
        if(head == null){
            return null;
        }

        ListNode prev = head;

        while(prev.next != null){
            if(prev.next.val == val){
                prev.next = prev.next.next;
            }else{
                prev = prev.next;
            }
        }
        return head;
    }


    private class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
