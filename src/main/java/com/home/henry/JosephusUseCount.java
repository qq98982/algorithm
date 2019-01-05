package com.home.henry;

import java.util.LinkedList;
import java.util.List;

public class JosephusUseCount {
    public static void findLastInJosephus(int n, int k) {
        List<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(i + 1);
        }
        int i = -1;
        int count = 0;
        while (q.size() > 0) {
            i++;
            if (i == q.size()) {
                i = 0;
            }
            count++;
            if (count == k) {
                System.out.print(q.get(i) + " ");
                q.remove(i);
                count = 0;
                i--;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        findLastInJosephus(5, 3);
        findLastInJosephus(1, 1);
        findLastInJosephus(2, 1);
        findLastInJosephus(3, 2);
        findLastInJosephus(10, 3);
        findLastInJosephus(41, 3);
    }
}
