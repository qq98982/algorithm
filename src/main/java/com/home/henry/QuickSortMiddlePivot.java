package com.home.henry;

public class QuickSortMiddlePivot {
    public static void qSort(int[] a, int head, int tail) {
        if (head >= tail || a == null || a.length <= 1) {
            return;
        }
        int i = head, j = tail, pivot = a[(head + tail) / 2];
        while (i <= j) {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            } else if (i == j) {
                i++;
            }
        }
        qSort(a, head, j);
        qSort(a, i, tail);
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 4, 8, 2, 55, 3, 6, 0, 11, 34, 90, 23, 54, 77, 9, 10 };
        qSort(arr, 0, arr.length - 1);
        StringBuilder sb = new StringBuilder();
        for (int digit : arr) {
            sb.append(digit).append(" ");
        }
        System.out.println(sb.toString());
    }

}
