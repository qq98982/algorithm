package com.home.henry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class URLifyTest {

    @Test
    void urlFy() {
        URLify urLify = new URLify();
        Assertions.assertEquals("", urLify.urlFy(null, 3));
        Assertions.assertEquals("", urLify.urlFy("", 0));
        Assertions.assertEquals("", urLify.urlFy("", 100));
        String str1 = urLify.urlFy("My name is Henry  ", 16);
        String str2 = urLify.urlFy("My name is Henry  ", 17);
        String str3 = urLify.urlFy("My name is Henry  ", 100);
        Assertions.assertEquals("My%20name%20is%20Henry", str1);
        Assertions.assertEquals("My%20name%20is%20Henry%20", str2);
        Assertions.assertEquals("", str3);
    }
}