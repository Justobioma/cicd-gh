package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testOutputMessage() {
        String expected = "Hello, CI/CD world!";
        assertEquals(expected, App.getGreeting());
    }
}