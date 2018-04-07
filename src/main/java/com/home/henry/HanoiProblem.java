package com.home.henry;

public class HanoiProblem {

    public static void hanoi(int n, String a, String b, String c) {
        if (n == 1) {
            System.out.println(a + " -> " + c);
        } else {
            hanoi(n - 1, a, c, b);
            System.out.println(a + " -> " + c);
            hanoi(n - 1, b, a, c);
        }
    }

    public static void main(String[] args) {
        hanoi(3, "a", "b", "c");
    }
}
