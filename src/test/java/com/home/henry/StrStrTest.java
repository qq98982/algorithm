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
    void getIndex() {
        StrStr str = new StrStr();
        Assertions.assertEquals(0, str.getIndex("", ""));
        Assertions.assertEquals(0, str.getIndex("a", "a"));
        Assertions.assertEquals(-1, str.getIndex("", null));
        Assertions.assertEquals(-1, str.getIndex("a", "c"));
        Assertions.assertEquals(-1, str.getIndex("abcdef", "efc"));
        Assertions.assertEquals(-1, str.getIndex("a", "ac"));
        Assertions.assertEquals(2, str.getIndex("abcabc", "ca"));
        Assertions.assertEquals(4, str.getIndex("abcdef", "ef"));
        Assertions.assertEquals(4, str.getIndex("abcdefefef", "ef"));
    }
}