package com.home.henry;

public class ReverseString {
    public String reverseString(String str) {
        return this.reverseString(str, true);
    }

    public String reverseString(String str, boolean change) {
        if (null == str || str.length() == 0) {
            return "";
        }
        char[] ch = str.toCharArray();
        if (!change) {
            StringBuilder s = new StringBuilder();
            for (int i = ch.length - 1; i >= 0; i--) {
                s.append(ch[i]);
            }
            return s.toString();
        }

        for (int i = 0; i < ch.length / 2; i++) {
            swap(ch, i);
        }
        return String.valueOf(ch);
    }

    private void swap(char[] ch, int i) {
        char tmp = ch[i];
        ch[i] = ch[ch.length - i - 1];
        ch[ch.length - i - 1] = tmp;
    }

    public static void main(String[] args) {
        ReverseString r = new ReverseString();
        String s = r.reverseString("this is a common word");
        System.out.println(s);

        String s2 = r.reverseString("this is a common word, not change", false);
        System.out.println(s2);

        String s3 = r.reverseString(null, false);
        System.out.println(s3);
    }
}
