package com.example;

import com.example.model.User;
import com.example.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main application class
 */
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Starting application");

        try {
            UserService userService = new UserService();

            // Create example user
            User user = new User("Alice", "alice@example.com");
            User createdUser = userService.createUser(user);

            logger.info("User created: {}", createdUser);

            // Display all users
            userService.getAllUsers().forEach(u ->
                    logger.info("User: {}", u)
            );

        } catch (Exception e) {
            logger.error("Application error", e);
        }

        logger.info("Application finished");
    }
}