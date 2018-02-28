package com.home.henry;

/**
 * Write a method to replace all spaces in a string with '%20'. You may assume that the string
 * has sufficient space at the end to hold the additional characters,and that you are given the "true"
 * length of the string. (Note: If implementing in Java, please use a character array so that you can
 * perform this operation in place.)
 */
public class URLify {
    String urlFy(String source, int length) {
        if (null == source || source.length() < 1 || source.length() < length) {
            return "";
        }
        source = source.substring(0, length);
        int blankNum = 0;
        char[] chars = source.toCharArray();
        for (char aChar : chars) {
            if (aChar == ' ') {
                blankNum++;
            }
        }
        char[] charFinal = new char[length + blankNum * 2];
        for (int i = length - 1, j = length + blankNum * 2 - 1; i >= 0; i--) {
            char c = chars[i];
            if (c == ' ') {
                charFinal[j--] = '0';
                charFinal[j--] = '2';
                charFinal[j--] = '%';
            } else {
                charFinal[j--] = c;
            }
        }
        return String.valueOf(charFinal);
    }
}
