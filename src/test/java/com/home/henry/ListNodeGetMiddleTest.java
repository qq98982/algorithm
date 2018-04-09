package com.home.henry;

import static com.home.henry.ListNodeGetMiddle.getMiddle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListNodeGetMiddleTest {
    private ListNode n1;
    private ListNode n2;
    private ListNode n3;
    private ListNode n4;
    private ListNode n5;
    private ListNode n6;

    @BeforeEach
    void init() {
        n1 = new ListNode(1);
        n2 = new ListNode(2);
        n3 = new ListNode(3);
        n4 = new ListNode(4);
        n5 = new ListNode(5);
        n6 = new ListNode(6);
    }

    @Test
    void getMiddleTest() {
        ListNode nt = getMiddle(n1);
        Assertions.assertEquals(1, nt.data);
        n1.next = n2;
        nt = getMiddle(n1);
        Assertions.assertEquals(2, nt.data);
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        nt = getMiddle(n1);
        Assertions.assertEquals(3, nt.data);
        n5.next = n6;
        nt = getMiddle(n1);
        Assertions.assertEquals(4, nt.data);
    }
}