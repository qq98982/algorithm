package com.home.henry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BubbleSortTest {
    BubbleSort bubbleSort;
    int[] nums = { 1, 7, 5, 9, 3, 8 };

    @BeforeEach
    void setUp() {
        this.bubbleSort = new BubbleSort();
    }

    @Test
    void sort() {
        int[] sort = bubbleSort.sort(nums);
        Assertions.assertArrayEquals(new int[] { 1, 3, 5, 7, 8, 9 }, sort);
    }

    @Test
    void sortMinus() {
        int[] sort = bubbleSort.sortMinus(nums);
        Assertions.assertArrayEquals(new int[] { 1, 3, 5, 7, 8, 9 }, sort);
    }
}