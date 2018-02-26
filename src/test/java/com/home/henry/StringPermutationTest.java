package com.home.henry;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringPermutationTest {

    @Test
    void permutation() {
        StringPermutation stringPermutation = new StringPermutation();
        List<String> a = stringPermutation.permutation("aa");
        Assertions.assertEquals(1, a.size());
        List<String> abc = stringPermutation.permutation("acb");
        Assertions.assertEquals(6, abc.size());
        List<String> abd = stringPermutation.permutation("acbb");
        Assertions.assertEquals(12, abd.size());
        List<String> noOrder = stringPermutation.permutation("bcba");
        Assertions.assertEquals(20, noOrder.size());
        List<String> five = stringPermutation.permutation("bcdae");
        Assertions.assertEquals(120, five.size());
        List<String> six = stringPermutation.permutation("bcdaef");
        Assertions.assertEquals(720, six.size());
        List<String> seven = stringPermutation.permutation("gcdaefb");
        Assertions.assertEquals(5040, seven.size());
    }
}