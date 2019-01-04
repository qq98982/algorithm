package com.home.henry;

import java.util.Stack;

/**
 * Given a histogram of rectangle bars of each one unit wide. Find the maximum area rectangle in
 * the histogram.
 */
public class GetMaxAreaOfRectSec {
    public static int maxRecFromBottom(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int maxArea = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            while (!st.isEmpty() && height[i] <= height[st.peek()]) {
                int j = st.pop();
                int k = st.isEmpty() ? -1 : st.peek();
                int curArea = (i - k - 1) * height[j];
                maxArea = Math.max(maxArea, curArea);
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            int j = st.pop();
            int k = st.isEmpty() ? -1 : st.peek();
            int curArea = (height.length - k - 1) * height[j];
            maxArea = Math.max(maxArea, curArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println(maxRecFromBottom(new int[] { 1, 2, 4, 4, 4 }));
        System.out.println(maxRecFromBottom(new int[] { 1, 2, 3, 4, 5 }));
        System.out.println(maxRecFromBottom(new int[] { 4, 3, 2, 5, 6 }));
    }
}
