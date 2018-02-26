package com.home.henry;

/**
 * Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
 * "compressed" string would not become smaller than the original string, your method should return
 * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 */

public class StringCompression {
    String compression(String str) {
        if (null == str || str.length() < 2) {
            return str;
        }
        boolean matches = str.matches("[a-zA-Z]+");
        if (!matches) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char c = str.charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            } else {
                sb.append(c).append(count);
                c = str.charAt(i);
                count = 1;
            }
        }
        // Important: add last character!
        sb.append(c).append(count);
        if (sb.toString().length() >= str.length()) {
            return str;
        }
        return sb.toString();
    }
}
