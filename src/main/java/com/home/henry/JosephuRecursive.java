package com.home.henry;

/**
 * https://blog.csdn.net/m15682532244/article/details/78304165
 */
public class JosephuRecursive {
    public static void way1(int n, int m) {
        int r = 0;
        for (int i = 2; i <= n; i++) {
            r = (r + m) % i;
        }
        System.out.println(r + 1);
    }

    public static void main(String[] args) {
        way1(1,1);
        way1(2,1);
        way1(2,3);
        way1(5,3);
        way1(11, 3);
    }
}
