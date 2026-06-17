package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import java.util.List;


@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @GetMapping("/me")
    public User getCurrentUser(@AuthenticationPrincipal OAuth2User user) {

        String email = user.getAttribute("email");
        String name = user.getAttribute("name");

        return userRepository.findByEmail(email)
                .orElseGet(() -> userRepository.save(new User(email, name)));
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userRepository.findAll();

    }
}