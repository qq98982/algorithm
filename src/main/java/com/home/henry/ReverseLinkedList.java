package com.home.henry;

/**
 * Reverse a linked list
 */
public class ReverseLinkedList {

    ListNode reverse(ListNode current) {
        if (current == null) {
            return null;
        }
        ListNode prev = null;
        while (current != null) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
}
