package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.List;


@RestController
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/me")

    public UserResponseDTO getCurrentUser(@AuthenticationPrincipal OAuth2User user) {

        User CurrentUser = userService.processGoogleUser(user);

        return new UserResponseDTO(
                CurrentUser.getEmail(),
                CurrentUser.getName() ,
                CurrentUser.getRole()
        );

    }


    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

}
