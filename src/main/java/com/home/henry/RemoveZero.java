package com.home.henry;

/**
 * 去掉String中连续出现k个0的sub string
 */
public class RemoveZero {

    private static String removeZeros(String in, int k) {
        char[] inArr = in.toCharArray();
        int count = 0;
        int start = -1;
        for (int i = 0; i < inArr.length; i++) {
            if (inArr[i] == '0') {
                count++;
                start = start == -1 ? i : start;
            } else {
                if (count == k) {
                    while (count-- != 0) {
                        inArr[start++] = 0;
                    }
                }
                count = 0;
                start = -1;
            }
        }
        if (count == k) {
            while (count-- != 0) {
                inArr[start++] = 0;
            }
        }
        return String.valueOf(inArr).replace("\u0000","");
    }

    public static void main(String[] args) {
        assert "ABab0".equals(removeZeros("AB0000ab0", 4));
        assert "ABab".equals(removeZeros("AB0000ab0000", 4));
        assert "ABab".equals(removeZeros("AB0000ab0000", 4));
        assert "AB00000ab00000".equals(removeZeros("AB00000ab00000", 4));
        assert "AB00000ab".equals(removeZeros("AB00000ab0000", 4));
    }
}