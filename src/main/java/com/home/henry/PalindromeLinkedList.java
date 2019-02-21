package com.home.henry;

/**
 * Given a singly linked list, determine if it is a palindrome.
 * O(n) time and O(1) space?
 */
class PalindromeLinkedList {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public boolean isPalindrome(ListNode head) {
        // count length
        int count = 0;

        // Do not change head!!!
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            count++;
        }
        if (count < 2) {
            return true;
        }
        curr = head;
        // reverse last half part, return end part head
        ListNode endHead = reverseEnd(curr, count);
        // iterate, check if it is equal
        return checkPalindrome(head, endHead);
    }

    // reverse half end part
    private ListNode reverseEnd(ListNode head, int count) {
        for (int i = 0; i < count / 2; i++) {
            if (head != null) {
                head = head.next;
            }
        }
        return reverse(head);
    }

    // reverse a LinkedList
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }
        return prev;
    }

    private boolean checkPalindrome(ListNode head, ListNode endHead) {
        while (head != null && endHead != null) {
            if (head.val != endHead.val) {
                return false;
            }
            head = head.next;
            endHead = endHead.next;
        }
        return true;
    }
}