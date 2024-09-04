package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyWebAppTest {
    @Test
    public void testGreet() {
        MyWebApp app = new MyWebApp();
        String result = app.greet(); // Assume 'greet' is a method in MyWebApp
        assertEquals("Hello, World!", result);
    }
}
