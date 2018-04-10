package com.home.henry;

/**
 * 	Binary Search a sorted array
 */
public class BinarySearchSortedArray {

    public static int binarySearch(int[] a, int value) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == value) {
                return mid;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    // Recursive	Way
    public static int binarySearchRecurive(int[] a, int low, int high, int value) {
        if (low > high || high > a.length - 1) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (a[mid] == value) {
            return mid;
        }
        if (a[mid] < value) {
            return binarySearchRecurive(a, mid + 1, high, value);
        } else {
            return binarySearchRecurive(a, low, mid - 1, value);
        }
    }
}
