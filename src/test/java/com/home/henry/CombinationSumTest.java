package com.home.henry;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CombinationSumTest {

    private CombinationSum combinationSum;

    @BeforeEach
    void getCombinationSumIns() {
        this.combinationSum = new CombinationSum();
    }

    @Test
    void getCombinationSumTest() {
        int[] nums = { 2, 3, 7, 7, 6 };
        List<List<Integer>> results = combinationSum.getCombinationSum(nums, 7);
        Assertions.assertEquals(2, results.size());
        Assertions.assertSame(3, results.get(0).size());
        Assertions.assertSame(2, results.get(0).get(1));
        Assertions.assertSame(3, results.get(0).get(2));
        Assertions.assertSame(7, results.get(1).get(0));
    }

    @Test
    void getCombinationSumTestSec() {
        int[] nums = { 2, 3, 3, 5, 7, 6 };
        List<List<Integer>> results = combinationSum.getCombinationSum(nums, 7);
        Assertions.assertEquals(3, results.size());
        Assertions.assertSame(3, results.get(0).size());
        Assertions.assertSame(2, results.get(0).get(1));
        Assertions.assertSame(3, results.get(0).get(2));
        Assertions.assertSame(2, results.get(1).get(0));
        Assertions.assertSame(5, results.get(1).get(1));
        Assertions.assertSame(7, results.get(2).get(0));
    }
}