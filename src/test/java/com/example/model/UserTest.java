package com.example.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("User model tests")
class UserTest {

    @Test
    @DisplayName("User creation with full constructor")
    void testUserCreationWithConstructor() {
        User user = new User("John", "john@example.com");

        assertEquals("John", user.getName());
        assertEquals("john@example.com", user.getEmail());
    }

    @Test
    @DisplayName("User creation with default constructor")
    void testUserCreationDefault() {
        User user = new User();
        user.setName("Jane");
        user.setEmail("jane@example.com");

        assertEquals("Jane", user.getName());
        assertEquals("jane@example.com", user.getEmail());
    }

    @Test
    @DisplayName("User equality test")
    void testUserEquality() {
        User user1 = new User("John", "john@example.com");
        User user2 = new User("John", "john@example.com");
        User user3 = new User("Jane", "jane@example.com");

        assertEquals(user1, user2);
        assertNotEquals(user1, user3);
    }

    @Test
    @DisplayName("HashCode test")
    void testUserHashCode() {
        User user1 = new User("John", "john@example.com");
        User user2 = new User("John", "john@example.com");

        assertEquals(user1.hashCode(), user2.hashCode());
    }

    @Test
    @DisplayName("ToString method test")
    void testToString() {
        User user = new User("John", "john@example.com");
        String result = user.toString();

        assertTrue(result.contains("John"));
        assertTrue(result.contains("john@example.com"));
    }
}