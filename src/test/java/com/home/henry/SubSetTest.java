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
        Assertions.assertSame(5, results.get(3).get(2));
        Assertions.assertSame(5, results.get(7).get(0));
        Assertions.assertSame(2, results.get(6).get(0));
    }

    @Test
    void getSubSetLonger() {
        SubSet subSet = new SubSet();
        int[] nums = { 1, 5, 2, 4 };
        List<List<Integer>> results = subSet.getSublist(nums);
        Assertions.assertEquals(16, results.size());
        Assertions.assertSame(4, results.get(3).get(2));
        Assertions.assertSame(1, results.get(7).get(0));
        Assertions.assertSame(1, results.get(6).get(0));
    }
}