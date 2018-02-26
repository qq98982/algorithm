package com.home.henry;

import java.util.Arrays;

/**
 * Determine if a string has all unique characters.
 */
public class StringUnique {
    boolean ifUnique(String str) {
        if (null == str || 0 == str.length()) {
            return false;
        }
        char[] c = str.toCharArray();
        Arrays.sort(c);
        for (int i = 0; i < c.length; i++) {
            if (i > 0 && c[i] == c[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
