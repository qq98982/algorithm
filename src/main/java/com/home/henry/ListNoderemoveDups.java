package com.home.henry;

import java.util.HashSet;
import java.util.Set;

/**
 * Write code to remove duplicates from an unsorted linked list.
 */
public class ListNoderemoveDups {

    ListNode deleteDups(ListNode n) {
        ListNode prev = null;
        Set<Integer> set = new HashSet<>();
        while (n != null) {
            if (set.contains(n.data)) {
                assert prev != null;
                prev.next = n.next;
            } else {
                set.add(n.data);
                prev = n;
            }
            n = n.next;
        }
        return prev;
    }
}
