package com.home.henry;

/**
 * This is a test for soft copy of LinkedList
 * change heap value can change linked list structure
 */
public class SoftCopyOfLinkedList {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        ListNode head = n1;
        ListNode.printListNode(head);
        n1 = n2;
        ListNode.printListNode(head);
    }
}
