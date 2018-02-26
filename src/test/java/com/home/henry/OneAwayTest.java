package com.home.henry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OneAwayTest {

    @Test
    void isOneWay() {
        OneAway oneAway = new OneAway();
        Assertions.assertTrue(oneAway.isOneWay("pale", "ple"));
        Assertions.assertTrue(oneAway.isOneWay("", "p"));
        Assertions.assertTrue(oneAway.isOneWay("p", ""));
        Assertions.assertTrue(oneAway.isOneWay("pales", "pale"));
        Assertions.assertTrue(oneAway.isOneWay("pale", "bale"));
        Assertions.assertFalse(oneAway.isOneWay("pale", "bake"));
        Assertions.assertFalse(oneAway.isOneWay("teach", "teacher"));
    }
}