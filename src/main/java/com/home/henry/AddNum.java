package com.home.henry;

/**
 * 计算一个String中的数字相加和, 如果有"-"算是负号, "--"算是正号
 */
public class AddNum {
    public static int addNum(char[] chars) {
        int res = 0;
        int num = 0;
        boolean isPlus = true;
        int cur;
        for (int i = 0; i < chars.length; i++) {
            cur = chars[i] - '0';
            if (chars[i] < '0' || chars[i] > '9') {
                res += num;
                num = 0;
                if (chars[i] == '-') {
                    if (i > 0 && chars[i - 1] == '-') {
                        isPlus = !isPlus;
                    } else {
                        isPlus = false;
                    }
                } else {
                    isPlus = true;
                }
            } else {
                cur = isPlus?cur:-cur;
                num = num * 10 + cur;
            }
        }
        res += num;
        return res;
    }

    public static void main(String[] args) {

        assert addNum("135".toCharArray()) == 135;
        assert addNum("---135".toCharArray()) == -135;
        assert addNum("-136".toCharArray()) == -136;
        assert addNum("A-136B13".toCharArray()) == -123;
        assert addNum("A-13-13".toCharArray()) == -26;
    }

}