package com.home.henry;

/**
 *  Assume you have a method isSubString which checks if one word is a substring
 *  of another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one
 *  call to isSubString (e.g., "waterbottle" is a rotation of" erbottlewat")
 */
public class StringRotation {

    boolean isRotation(String s1, String s2) {
        if (null == s1 || null == s2) {
            return false;
        }
        if ((s1.length() == s2.length()) && s1.length() > 0) {
            return isSubString(s1 + s1, s2);
        }
        return false;
    }

    private boolean isSubString(String s, String s2) {
        return s.contains(s2);
    }

}
