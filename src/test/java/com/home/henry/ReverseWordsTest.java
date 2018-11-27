package com.home.henry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseWordsTest {

    @Test
    void reverseWords() {
        ReverseWords r = new ReverseWords();
        assertEquals("am I", r.reverseWords("I am".toCharArray()));
        assertEquals("engineer an am I", r.reverseWords("I am an engineer".toCharArray()));
        assertEquals("engineer! an am I", r.reverseWords("I am an engineer!".toCharArray()));
        assertEquals(" engineer! an am I", r.reverseWords("I am an engineer! ".toCharArray()));
        assertEquals(" engineer! an am I ", r.reverseWords(" I am an engineer! ".toCharArray()));
        assertEquals(" ", r.reverseWords(" ".toCharArray()));
        assertEquals(null, r.reverseWords("".toCharArray()));
    }
}
