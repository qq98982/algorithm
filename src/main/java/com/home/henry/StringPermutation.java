package com.home.henry;

import java.util.ArrayList;
import java.util.List;

/**
 * Print n! permutation of the characters of the string
 */
public class StringPermutation {

    List<String> permutation(String str) {
        List<String> result = new ArrayList<>();
        permutation("", str, result);
        return result;
    }

    private static void permutation(String prefix, String str, List<String> results) {
        int n = str.length();
        if (n == 0) {
            results.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), results);
            }
        }
    }

}
