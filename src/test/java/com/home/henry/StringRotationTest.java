package com.home.henry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringRotationTest {

    @Test
    void isRotation() {
        StringRotation sr = new StringRotation();
        Assertions.assertTrue(sr.isRotation("w", "w"));
        Assertions.assertTrue(sr.isRotation("wa", "aw"));
        Assertions.assertTrue(sr.isRotation("waterbottle", "erbottlewat"));
        Assertions.assertFalse(sr.isRotation("", ""));
        Assertions.assertFalse(sr.isRotation("", null));
        Assertions.assertFalse(sr.isRotation("waterbottle", "erbottletwa"));
    }
}