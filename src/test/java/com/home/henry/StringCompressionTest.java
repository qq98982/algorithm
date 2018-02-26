package com.home.henry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringCompressionTest {

    @Test
    void compression() {
        StringCompression sc = new StringCompression();
        Assertions.assertEquals(null,sc.compression(null));
        Assertions.assertEquals("",sc.compression(""));
        Assertions.assertEquals("a",sc.compression("a"));
        Assertions.assertEquals("abbb",sc.compression("abbb"));
        Assertions.assertEquals("a1b4",sc.compression("abbbb"));
        Assertions.assertEquals("a1b5c1",sc.compression("abbbbbc"));
        Assertions.assertEquals("a3b5c2",sc.compression("aaabbbbbcc"));
        Assertions.assertEquals("11111",sc.compression("11111"));
    }
}