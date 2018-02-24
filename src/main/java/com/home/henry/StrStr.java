package com.home.henry;

/**
 * Another question which belongs to the category of questions which are intentionally stated vaguely.
 * Expectation is that you will ask for correct clarification or you will state your assumptions before you start coding.
 *
 * Implement strStr().
 *
 * strstr - locate a substring ( needle ) in a string ( haystack ).
 *
 * Try not to use standard library string functions for this question.
 *
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * NOTE:
 *
 * Good clarification questions:
 *
 * What should be the return value if the needle is empty ?
 * What if both haystack and needle are empty ?
 * For the purpose of this problem, assume that the return value should be -1 in both cases.
 */
public class StrStr {

    int getStrStr(String haystack, String needle) {
        if (null == haystack || null == needle || haystack.length() < needle.length()) {
            return -1;
        }
        if (needle.length() < 1) {
            return -1;
        }
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) == needle.charAt(j)) {
                    if (j == needle.length() - 1) {
                        return i;
                    }
                } else {
                    break;
                }
            }
        }
        return -1;
    }

    int getStrStrBetter(String haystack, String needle) {
        if (null == haystack || null == needle || haystack.length() < needle.length()) {
            return -1;
        }
        if (needle.length() < 1) {
            return -1;
        }
        int i, j;
        for (i = 0, j = 0; i < haystack.length() && j < needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            } else {
                j = 0;
            }
        }
        if (j == needle.length()) {
            return i - needle.length();
        } else {
            return -1;
        }
    }
}
