package com.example.util;

/**
 * String utilities
 */
public final class StringUtils {

    private StringUtils() {
        // Utility class - private constructor
    }

    /**
     * Checks if a string is empty or null
     */
    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    /**
     * Checks if a string is not empty
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /**
     * Capitalizes the first letter of a string
     */
    public static String capitalize(String str) {
        if (isEmpty(str)) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() +
                str.substring(1).toLowerCase();
    }

    /**
     * Removes leading and trailing whitespace
     */
    public static String trim(String str) {
        return str == null ? null : str.trim();
    }
}