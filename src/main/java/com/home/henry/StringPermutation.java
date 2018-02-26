package com.home.henry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Print n! permutation of the characters of the string
 */
public class StringPermutation {

    List<String> permutation(String str) {
        List<String> result = new ArrayList<>();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        str = new String(chars);
        permutation("", str, result);
        return result;
    }

    private static void permutation(String prefix, String str, List<String> results) {
        int n = str.length();
        if (n == 0) {
            results.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                if (i > 0 && str.charAt(i) == str.charAt(i - 1)) {
                    continue;
                }
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), results);
            }
        }
    }

}
