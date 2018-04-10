package com.home.henry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchSortedArrayTest {

    private static final int[] a = { 1, 3, 5, 7, 9, 11 };

    @Test
    void binarySearchTest() {
        Assertions.assertEquals(0, BinarySearchSortedArray.binarySearch(new int[] {1}, 1));
        Assertions.assertEquals(-1, BinarySearchSortedArray.binarySearch(new int[] {}, 0));
        Assertions.assertEquals(2, BinarySearchSortedArray.binarySearch(a, 5));
        Assertions.assertEquals(5, BinarySearchSortedArray.binarySearch(a, 11));
        Assertions.assertEquals(-1, BinarySearchSortedArray.binarySearch(a, 8));
    }

    @Test
    void binarySearchRecurive() {
        Assertions.assertEquals(0, BinarySearchSortedArray.binarySearchRecurive(new int[] {1,2}, 0,1,1));
        Assertions.assertEquals(-1, BinarySearchSortedArray.binarySearchRecurive(new int[] {}, 0,0,0));
        Assertions.assertEquals(2, BinarySearchSortedArray.binarySearchRecurive(a,0,a.length-1, 5));
        Assertions.assertEquals(5, BinarySearchSortedArray.binarySearchRecurive(a, 0,a.length-1, 11));
        Assertions.assertEquals(-1, BinarySearchSortedArray.binarySearchRecurive(a, 0,a.length-1, 8));
    }
}