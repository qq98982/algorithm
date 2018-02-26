package com.home.henry;

/**
 * There are three types of edits that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to check if they are
 * one edit (or zero edits) away.
 */
public class OneAway {
    boolean isOneWay(String source, String target) {
        if (null == source || null == target) {
            return false;
        }
        if (Math.abs(source.length() - target.length()) > 1) {
            return false;
        }
        int i = 0, j = 0;
        int count = 0;
        while (i < source.length() && j < target.length()) {
            if (source.charAt(i) != target.charAt(j)) {
                if (count > 0) {
                    return false;
                }
                count++;
                if (source.length() > target.length()) {
                    i++;
                }
                if (source.length() < target.length()) {
                    j++;
                }
            }
            i++;
            j++;
        }
        return true;
    }
}
