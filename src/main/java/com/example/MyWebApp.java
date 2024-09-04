package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyWebApp {

    @Test
    public void testGreeting() {
        MyWebApp app = new MyWebApp();
        String greeting = app.greet();
        assertEquals("Hello, World!", greeting);
    }
}