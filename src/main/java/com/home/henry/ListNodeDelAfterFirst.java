package com.home.henry;

/**
 delete a node in the middle (i.e., any node but
 the first and last node, not necessarily the exact middle)
 of a singly linked list, given only access to that node.
 */
public class ListNodeDelAfterFirst {

    boolean deleteAfterFirst(ListNode n) {
        if (null == n || null == n.next) {
            return false;
        }
        ListNode next = n.next;
        n.data = next.data;
        n.next = next.next;
        return true;
    }
}
