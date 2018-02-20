package com.home.henry;

/**
 * Bubble sort
 */
public class BubbleSort {
    private int[] sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }

    private int[] sortMinus(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; --j) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] nums = { 1, 7, 5, 9, 3, 8 };
        int[] sort = bubbleSort.sort(nums);
        assert 1 == sort[0];
        assert 3 == sort[1];
        assert 5 == sort[2];
        assert 9 == sort[5];
        for (int i = 0; i < sort.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
