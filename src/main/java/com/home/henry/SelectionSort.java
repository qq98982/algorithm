package com.home.henry;

public class SelectionSort {
    public static void sortBackArray(int[] a) {
        int size = a.length;
        int i, j, max, temp;
        for (i = 0; i < size; i++) {
            max = 0;
            for (j = 1; j < size - i; j++) {
                if (a[j] > a[max]) {
                    max = j;
                }
            }
            temp = a[size - 1 - i];
            a[size - 1 - i] = a[max];
            a[max] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = { 0, 9, 1, 8, 2, 7, 3, 6, 4, 5 };
        sortBackArray(a);
        StringBuilder sb = new StringBuilder();
        for (int result : a) {
            sb.append(result).append(" ");
        }
        System.out.println(sb.toString());
    }
}
