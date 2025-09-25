package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Main application tests")
class AppTest {

    @Test
    @DisplayName("Main application should not throw exception")
    void testMainDoesNotThrow() {
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}