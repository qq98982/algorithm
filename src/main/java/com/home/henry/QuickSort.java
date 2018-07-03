package com.home.henry;

import java.util.LinkedList;
import java.util.Queue;

public class QuickSort {

    public static void qSort(int[] a, int l, int r) {
        if (l < r) {
            int i = l, j = r, x = a[l];
            while (i < j) {
                while (i < j && a[j] >= x) {j--;}
                if (i < j) {
                    a[i] = a[j];
                }

                while (i < j && a[i] < x) {i++;}
                if (i < j) {
                    a[j] = a[i];
                }
            }
            a[i] = x;
            qSort(a, l, i - 1);
            qSort(a, i + 1, r);
            Queue<Integer> list = new LinkedList<>();
            list.poll();

        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 4, 8, 2, 55, 3, 4, 8, 6, 4, 0, 11, 34, 90, 23, 54, 77, 9, 2, 9, 4, 10 };
        qSort(arr, 0, arr.length - 1);
        StringBuilder sb = new StringBuilder();
        for (int digit : arr) {
            sb.append(digit).append(" ");
        }
        System.out.println(sb.toString());
    }
}