package com.home.henry;

/**
 * To check whether a LinkedList is a loop one
 */
public class ListNodeIsLoop {

    public static boolean isLoopList(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;
        while (slow != null && fast != null && fast.next != null) {
            if (fast == slow || fast.next == slow) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
