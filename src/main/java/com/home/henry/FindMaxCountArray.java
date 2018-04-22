package com.home.henry;

import java.util.Arrays;

public class FindMaxCountArray {

    public static int findMax(int[] a, int size) {
        int i, j;
        int max = a[0];
        int count;
        int maxCount = 1;
        for (i = 0; i < size; i++) {
            count = 1;
            for (j = i + 1; j < size; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
                if (count > maxCount) {
                    max = a[i];
                    maxCount = count;
                }
            }
        }
        return max;
    }

    public static int findMaxUseSort(int[] a, int size) {
        if (size > a.length) {
            return a[0];
        }
        Arrays.sort(a);
        int count = 1, maxCount = 1, max = a[0];
        for (int i = 1; i < size; i++) {
            if (a[i] == a[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            if (count > maxCount) {
                maxCount = count;
                max = a[i];
            }
        }
        return max;
    }

}
