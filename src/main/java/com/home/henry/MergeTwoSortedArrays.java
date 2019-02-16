package com.home.henry;

public class MergeTwoSortedArrays {
    public int[] merge(int[] first, int[] second) {
        if (first.length < 1 && second.length < 1) {
            return null;
        }
        int m = first.length - 1;
        int n = second.length - 1;
        int[] res = new int[m + n + 2];
        for (int i = res.length - 1; i >= 0; i--) {
            if (n >= 0 && m >= 0) {
                if (first[m] > second[n]) {
                    res[i] = first[m--];
                } else {
                    res[i] = second[n--];
                }
            } else {
                if (m < 0) {
                    res[i] = second[n--];
                }
                if (n < 0) {
                    res[i] = first[m--];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 1, 3, 5, 6, 9 };
        int[] b = new int[] { 2, 4, 7, 8 };
        MergeTwoSortedArrays m = new MergeTwoSortedArrays();
        int[] c = m.merge(a, b);
        for (int aC : c) {
            System.out.print(aC + " ");
        }
    }
}
