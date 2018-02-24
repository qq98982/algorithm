package com.home.henry;

/**
 * ALGORITHM  StrStr
 * Description: StrStr brutal force method
 * Author: Henry
 * Created on 2018年02月24日
 */
public class StrStr {

    int getIndex(String source, String target) {
        if (null == source || null == target || source.length() < target.length()) {
            return -1;
        }
        if (target.length() < 1) {
            return 0;
        }
        for (int i = 0; i < source.length() - target.length() + 1; i++) {
            for (int j = 0; j < target.length(); j++) {
                if (source.charAt(i + j) == target.charAt(j)) {
                    if (j == target.length() - 1) {
                        return i;
                    }
                } else {
                    break;
                }
            }
        }
        return -1;
    }
}
