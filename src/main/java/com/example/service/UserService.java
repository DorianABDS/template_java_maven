package com.example.service;

import com.example.model.User;
import com.example.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Service to manage users
 */
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    private final List<User> users = new ArrayList<>();

    /**
     * Creates a new user
     */
    public User createUser(User user) {
        validateUser(user);

        logger.debug("Creating user: {}", user.getName());
        users.add(user);
        logger.info("User created successfully: {}", user.getEmail());

        return user;
    }

    /**
     * Finds a user by email
     */
    public Optional<User> findUserByEmail(String email) {
        if (StringUtils.isEmpty(email)) {
            return Optional.empty();
        }

        return users.stream()
                .filter(user -> email.equals(user.getEmail()))
                .findFirst();
    }

    /**
     * Gets all users
     */
    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }

    /**
     * Deletes a user
     */
    public boolean deleteUser(String email) {
        return users.removeIf(user -> email.equals(user.getEmail()));
    }

    private void validateUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }
        if (StringUtils.isEmpty(user.getName())) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (StringUtils.isEmpty(user.getEmail())) {
            throw new IllegalArgumentException("Email cannot be empty");
        }
    }
}