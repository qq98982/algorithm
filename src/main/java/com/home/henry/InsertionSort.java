package com.home.henry;

/**
 * Insertion sort perform a bit better than bubble sort
 */
public class InsertionSort {
    private static boolean more(int v1, int v2) {
        return v1 > v2;
    }

    public static void sort(int[] a) {
        int size = a.length;
        int temp, j;
        for (int i = 1; i < size; i++) {
            temp = a[i];
            for (j = i; j > 0 && more(a[j - 1], temp); j--) {
                a[j] = a[j - 1];
            }
            a[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
        sort(a);
        for (int result : a) {
            System.out.println(result);
        }
    }
}
