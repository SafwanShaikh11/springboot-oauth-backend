package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void createUser() {

        User user = new User("walterwhte112@gmail.com", "safwan");

        //Assert
        assertEquals("walterwhte112@gmail.com", user.getEmail());
        assertEquals("safwan", user.getName());
        assertEquals("USER", user.getRole());
    }

    @Test
    public void createController() {

        HelloController controller = new HelloController();

        //Assert
        //variable response since the mapping function returns a Hashmap

        Map<String, String> response = controller.health();
        assertEquals("UP", response.get("status"));

    }

}
