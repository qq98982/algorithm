package com.home.henry;

import java.util.Arrays;

/**
 * Given two array X and Y. Find a pair of elements (xi, yi) such that xi ∈X and yi ∈Y where xi + yi = value.
 */
public class FindPairInTwoArrays {
    public static int findPairInTwoArray(int[] a, int[] b, int value) {
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = b.length - 1;
        for (; i < a.length - 1 && j > 0; ) {
            if ((a[i] + b[j]) == value) {
                System.out.println(a[i] + "-" + b[j]);
                return 0;
            } else if ((a[i] + b[j]) < value) {
                i++;
            } else {
                j--;
            }
        }
        return -1;
    }
}
