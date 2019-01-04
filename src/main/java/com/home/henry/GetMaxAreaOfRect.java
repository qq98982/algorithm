package com.home.henry;

import java.util.ArrayDeque;

/**
 * Given a histogram of rectangle bars of each one unit wide. Find the maximum area rectangle in
 * the histogram.
 */
public class GetMaxAreaOfRect {
    public static int getMaxArea(int[] a) {
        int maxArea = 0;
        if (a.length < 1) {
            return maxArea;
        }
        int size = a.length;
        int top;
        int topArea;
        ArrayDeque<Integer> stk = new ArrayDeque<>();
        int i = 0;
        while (i < size) {
            while ((i < size) && (stk.isEmpty() || a[stk.peek()] <= a[i])) {
                stk.push(i);
                i++;
            }
            while (!stk.isEmpty() && (i == size || a[stk.peek()] > a[i])) {
                top = stk.peek();
                stk.pop();
                topArea = a[top] * (stk.isEmpty() ? i : i - stk.peek() - 1);
                maxArea = Math.max(topArea, maxArea);
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println(getMaxArea(new int[] { 1, 2, 4, 4, 4 }));
        System.out.println(getMaxArea(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(getMaxArea(new int[] { 4, 3, 2, 5, 6 }));
    }
}
