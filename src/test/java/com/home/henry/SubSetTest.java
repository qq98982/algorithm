package com.home.henry;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubSetTest {

    @Test
    void getSubSet() {
        SubSet subSet = new SubSet();
        int[] nums = { 1, 5, 2 };
        List<List<Integer>> results = subSet.getSublist(nums);
        Assertions.assertEquals(results.size(), 8);
        Assertions.assertSame(results.get(3).get(2), 5);
        Assertions.assertSame(results.get(7).get(0), 5);
        Assertions.assertSame(results.get(6).get(0), 2);
    }

    @Test
    void getSubSetLonger() {
        SubSet subSet = new SubSet();
        int[] nums = { 1, 5, 2, 4 };
        List<List<Integer>> results = subSet.getSublist(nums);
        Assertions.assertEquals(results.size(), 16);
        Assertions.assertSame(results.get(3).get(2), 4);
        Assertions.assertSame(results.get(7).get(0), 1);
        Assertions.assertSame(results.get(6).get(0), 1);
    }
}