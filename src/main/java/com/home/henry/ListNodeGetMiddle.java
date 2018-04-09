package com.home.henry;

/**
 * Get middle node of LinkedList
 */
public class ListNodeGetMiddle {

    public static ListNode getMiddle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

}
