package com.home.henry;

/**
 * Linked List Node
 */
public class ListNode {
    ListNode next;
    int data;

    ListNode() {}

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public static void printListNode(ListNode node) {
        while (node != null) {
            System.out.print(node.data);
            System.out.print("->");
            node = node.next;
        }
        System.out.println("null");
    }

    void appendToTail(int d) {
        ListNode end = new ListNode();
        end.data = d;
        ListNode n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    ListNode deleteNode(ListNode head, int d) {
        ListNode n = head;
        if (n.data == d) {
            return head.next;
        }
        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }
}
