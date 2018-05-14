package com.home.henry;

/**
 * BubbleSort, best case is O(n), worst is O(n2)
 */
public class BubbleSortImproved {
    public static void sort(int[] a) {
        int size = a.length;
        int i, j, temp, swapped = 1;
        for (i = 0; i < (size - 1) && swapped == 1; i++) {
            swapped = 0;
            for (j = 0; j < size - i - 1; j++) {
                if (more(a[j], a[j + 1])) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = 1;
                }
            }
        }
    }

    private static boolean more(int v1, int v2) {
        return v1 > v2;
    }

}
