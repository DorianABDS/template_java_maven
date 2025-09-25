package com.example.util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("String utilities tests")
class StringUtilsTest {

    @Test
    @DisplayName("Test isEmpty with null string")
    void testIsEmptyWithNull() {
        assertTrue(StringUtils.isEmpty(null));
    }

    @Test
    @DisplayName("Test isEmpty with empty string")
    void testIsEmptyWithEmptyString() {
        assertTrue(StringUtils.isEmpty(""));
        assertTrue(StringUtils.isEmpty("   "));
    }

    @Test
    @DisplayName("Test isEmpty with valid string")
    void testIsEmptyWithValidString() {
        assertFalse(StringUtils.isEmpty("hello"));
        assertFalse(StringUtils.isEmpty("  hello  "));
    }

    @Test
    @DisplayName("Test isNotEmpty")
    void testIsNotEmpty() {
        assertTrue(StringUtils.isNotEmpty("hello"));
        assertFalse(StringUtils.isNotEmpty(""));
        assertFalse(StringUtils.isNotEmpty(null));
    }

    @Test
    @DisplayName("Test capitalize")
    void testCapitalize() {
        assertEquals("Hello", StringUtils.capitalize("hello"));
        assertEquals("Hello", StringUtils.capitalize("HELLO"));
        assertEquals("H", StringUtils.capitalize("h"));
        assertEquals("", StringUtils.capitalize(""));
        assertNull(StringUtils.capitalize(null));
    }

    @Test
    @DisplayName("Test trim")
    void testTrim() {
        assertEquals("hello", StringUtils.trim("  hello  "));
        assertEquals("", StringUtils.trim("   "));
        assertNull(StringUtils.trim(null));
    }
}