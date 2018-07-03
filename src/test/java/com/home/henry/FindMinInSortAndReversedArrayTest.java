package com.home.henry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMinInSortAndReversedArrayTest {

    @Test
    void findMin() {
        int[] a = { 10, 20, 30, 40, 50, 1, 2, 3 };
        Assertions.assertEquals(1, FindMinInSortAndReversedArray
                .findMin(a, 0, a.length - 1));
        a = new int[] { 10, 20, 30, 40, 50 };
        Assertions.assertEquals(10, FindMinInSortAndReversedArray
                .findMin(a, 0, a.length - 1));
        a = new int[] { 1 };
        Assertions.assertEquals(1, FindMinInSortAndReversedArray
                .findMin(a, 0, a.length - 1));
        a = new int[] { 3, 2 };
        Assertions.assertEquals(2, FindMinInSortAndReversedArray
                .findMin(a, 0, a.length - 1));
        a = new int[] { 5, 6, 3, 4 };
        Assertions.assertEquals(3, FindMinInSortAndReversedArray
                .findMin(a, 0, a.length - 1));
    }
}