package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;

@RestController



public class me {

    @GetMapping("/Me")
          public User Me(@AuthenticationPrincipal OAuth2User user){

        String email = user.getAttribute("email");
        String name = user.getAttribute("name");

        return new User(email,name);
        }


    }

