package com.home.henry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListNodeIsLoopTest {
    private ListNode n1;
    private ListNode n2;
    private ListNode n3;
    private ListNode n4;
    private ListNode n5;
    private ListNode n6;

    @BeforeEach
    void setUp() {
        n1 = new ListNode(1);
        n2 = new ListNode(2);
        n3 = new ListNode(3);
        n4 = new ListNode(4);
        n5 = new ListNode(5);
        n6 = new ListNode(6);
    }

    @Test
    void isLoopList() {
        n1.next = n2;
        Assertions.assertFalse(ListNodeIsLoop.isLoopList(n1));
        n2.next = n1;
        Assertions.assertTrue(ListNodeIsLoop.isLoopList(n1));
        n2.next = n3;
        Assertions.assertFalse(ListNodeIsLoop.isLoopList(n1));
        n3.next = n4;
        Assertions.assertFalse(ListNodeIsLoop.isLoopList(n1));
        n4.next = n5;
        Assertions.assertFalse(ListNodeIsLoop.isLoopList(n1));
        n5.next = n2;
        Assertions.assertTrue(ListNodeIsLoop.isLoopList(n1));
        n5.next = n6;
        n6.next = n2;
        Assertions.assertTrue(ListNodeIsLoop.isLoopList(n1));
    }
}