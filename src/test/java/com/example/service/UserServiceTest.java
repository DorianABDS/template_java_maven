package com.example.service;

import com.example.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("UserService tests")
class UserServiceTest {

    private UserService userService;

    @BeforeEach
    void setUp() {
        userService = new UserService();
    }

    @Test
    @DisplayName("Valid user creation")
    void testCreateValidUser() {
        User user = new User("John", "john@example.com");
        User createdUser = userService.createUser(user);

        assertEquals(user, createdUser);
        assertEquals(1, userService.getAllUsers().size());
    }

    @Test
    @DisplayName("Creating null user throws exception")
    void testCreateNullUser() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> userService.createUser(null)
        );
        assertEquals("User cannot be null", exception.getMessage());
    }

    @Test
    @DisplayName("Creating user with empty name throws exception")
    void testCreateUserWithEmptyName() {
        User user = new User("", "john@example.com");

        assertThrows(IllegalArgumentException.class,
                () -> userService.createUser(user));
    }

    @Test
    @DisplayName("Find user by email")
    void testFindUserByEmail() {
        User user = new User("John", "john@example.com");
        userService.createUser(user);

        Optional<User> foundUser = userService.findUserByEmail("john@example.com");
        assertTrue(foundUser.isPresent());
        assertEquals(user, foundUser.get());
    }

    @Test
    @DisplayName("Find non-existent user")
    void testFindNonExistentUser() {
        Optional<User> notFound = userService.findUserByEmail("notfound@example.com");
        assertFalse(notFound.isPresent());
    }

    @Test
    @DisplayName("Delete user")
    void testDeleteUser() {
        User user = new User("John", "john@example.com");
        userService.createUser(user);

        boolean deleted = userService.deleteUser("john@example.com");
        assertTrue(deleted);
        assertEquals(0, userService.getAllUsers().size());
    }

    @Test
    @DisplayName("Delete non-existent user")
    void testDeleteNonExistentUser() {
        boolean deleted = userService.deleteUser("notfound@example.com");
        assertFalse(deleted);
    }
}