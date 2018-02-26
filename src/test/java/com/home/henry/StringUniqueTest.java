package com.home.henry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUniqueTest {

    @Test
    void ifUnique() {
        StringUnique stringUnique = new StringUnique();
        Assertions.assertTrue(stringUnique.ifUnique("abc"));
        Assertions.assertTrue(stringUnique.ifUnique("abc123"));
        Assertions.assertFalse(stringUnique.ifUnique("abcc"));
        Assertions.assertFalse(stringUnique.ifUnique("aabcc"));
        Assertions.assertFalse(stringUnique.ifUnique("abcabc"));
    }
}