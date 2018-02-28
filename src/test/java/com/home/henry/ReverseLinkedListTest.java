package com.home.henry;

import static com.home.henry.ListNode.printListNode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

    @Test
    void reverseTest() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        printListNode(node1);
        ReverseLinkedList r = new ReverseLinkedList();
        ListNode reverseListNode = r.reverse(node1);
        printListNode(reverseListNode);
        Assertions.assertEquals(3,reverseListNode.data);
        Assertions.assertEquals(2,reverseListNode.next.data);
        Assertions.assertEquals(1,reverseListNode.next.next.data);
    }
}