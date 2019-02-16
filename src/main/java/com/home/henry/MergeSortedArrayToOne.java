package com.home.henry;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * Example:
 *
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 *
 * nums1 = [0], m = 0
 * nums2 = [1], n = 1
 * Output: [1]
 */
class MergeSortedArrayToOne {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length < 1 && nums2.length < 1) {
            return;
        }
        int fIndex = m - 1;
        int sIndex = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (fIndex >= 0 && sIndex >= 0) {
                if (nums1[fIndex] > nums2[sIndex]) {
                    nums1[i] = nums1[fIndex--];
                } else {
                    nums1[i] = nums2[sIndex--];
                }
            } else {
                if (fIndex >= 0) {
                    nums1[i] = nums1[fIndex--];
                }
                if (sIndex >= 0) {
                    nums1[i] = nums2[sIndex--];
                }
            }
        }
    }

    public static void main(String[] args) {
        MergeSortedArrayToOne s = new MergeSortedArrayToOne();
        int[] a = new int[2];
        int[] b = new int[] { 1 };
        s.merge(a, 0, b, 1);
        for (int anA : a) {
            System.out.print(anA + " ");
        }
    }
}