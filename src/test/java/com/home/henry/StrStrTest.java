package com.home.henry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * ALGORITHM  StrStrTest
 * Description: StrStrTest
 * Author: Henry
 * Created on 2018年02月24日
 */
class StrStrTest {

    @Test
    void getStrStrTest() {
        StrStr str = new StrStr();
        Assertions.assertEquals(0, str.getStrStr("a", "a"));
        Assertions.assertEquals(-1, str.getStrStr("", ""));
        Assertions.assertEquals(-1, str.getStrStr("", null));
        Assertions.assertEquals(-1, str.getStrStr("a", "c"));
        Assertions.assertEquals(-1, str.getStrStr("abcdef", "efc"));
        Assertions.assertEquals(-1, str.getStrStr("a", "ac"));
        Assertions.assertEquals(2, str.getStrStr("abcabc", "ca"));
        Assertions.assertEquals(4, str.getStrStr("abcdef", "ef"));
        Assertions.assertEquals(4, str.getStrStr("abcdefefef", "ef"));

        Assertions.assertEquals(0, str.getStrStrBetter("a", "a"));
        Assertions.assertEquals(-1, str.getStrStrBetter("", ""));
        Assertions.assertEquals(-1, str.getStrStrBetter("", null));
        Assertions.assertEquals(-1, str.getStrStrBetter("a", "c"));
        Assertions.assertEquals(-1, str.getStrStrBetter("abcdef", "efc"));
        Assertions.assertEquals(-1, str.getStrStrBetter("a", "ac"));
        Assertions.assertEquals(2, str.getStrStrBetter("abcabc", "ca"));
        Assertions.assertEquals(4, str.getStrStrBetter("abcdef", "ef"));
        Assertions.assertEquals(4, str.getStrStrBetter("abcdefefef", "ef"));
    }
}