package com.home.henry;

/**
 * Bubble sort
 */
public class BubbleSort {
    int[] sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                }
            }
        }
        return nums;
    }

    private void swap(int[] nums, int j, int j1) {
        int temp = nums[j];
        nums[j] = nums[j1];
        nums[j1] = temp;
    }

    int[] sortMinus(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = nums.length - 1; j > i; --j) {
                if (nums[j - 1] > nums[j]) {
                    swap(nums, j - 1, j);
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] nums = { 11, 1, 7, 5, 9, 3, 8, 20, 19 };
        int[] sort = bubbleSort.sort(nums);
        int[] sort2 = bubbleSort.sortMinus(nums);
        for (int aSort : sort) {
            System.out.print(aSort + " ");
        }
        System.out.println();
        for (int aSort2 : sort2) {
            System.out.print(aSort2 + " ");
        }
    }
}
