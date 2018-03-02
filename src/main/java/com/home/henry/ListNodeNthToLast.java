package com.home.henry;

/**
 *  find the nth to last element of a singly linked list.
 */
public class ListNodeNthToLast {

    ListNode nthToLast(ListNode head, int n) {
        ListNode p1 = head;
        ListNode p2 = head;
        for (int i = 0; i < n; i++) {
            if (p1 == null) {
                return null;
            }
            p1 = p1.next;
        }
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }
}
