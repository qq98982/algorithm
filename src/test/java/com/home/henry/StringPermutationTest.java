package com.home.henry;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringPermutationTest {

    @Test
    void permutation() {
        StringPermutation stringPermutation = new StringPermutation();
        List<String> abc = stringPermutation.permutation("acb");
        Assertions.assertEquals(6, abc.size());
        for (String s : abc) {
            Assertions.assertEquals(3, s.length());
            Assertions.assertTrue(s.contains("a"));
            Assertions.assertTrue(s.contains("c"));
            Assertions.assertTrue(s.contains("b"));
        }
        List<String> abd = stringPermutation.permutation("acbb");
        Assertions.assertEquals(24, abd.size());
        for (String s : abd) {
            Assertions.assertEquals(4, s.length());
            Assertions.assertTrue(s.contains("a"));
            Assertions.assertTrue(s.contains("c"));
            Assertions.assertTrue(s.contains("b"));
        }
    }
}