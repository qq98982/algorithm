package com.home.henry;

/**
 * Reverse words order in a String
 */
public class ReverseWords {
    public String reverseWords(char[] c) {
        if (c == null || c.length == 0) {
            return null;
        }
        reverse(c, 0, c.length - 1);
        int l = -1;
        int r = -1;
        for (int i = 0; i < c.length; i++) {
            if (c[i] != ' ') {
                l = ((i == 0) || (c[i - 1] == ' ')) ? i : l;
                r = ((i == (c.length - 1)) || (c[i + 1] == ' ')) ? i : r;
            }
            if (l != -1 && r != -1) {
                reverse(c, l, r);
                l = -1;
                r = -1;
            }
        }
        return String.valueOf(c);
    }

    private static void reverse(char[] c, int l, int r) {
        char tmp;
        while (l < r) {
            tmp = c[l];
            c[l] = c[r];
            c[r] = tmp;
            l++;
            r--;
        }
    }
}
