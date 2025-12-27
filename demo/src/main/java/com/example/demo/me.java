package com.example.demo;

import org.springframework.security.core.userdetails.cache.SpringCacheBasedUserCache;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.HashMap;
import java.util.Map;

@RestController



public class me {

    @GetMapping("/me")
          public User me(@AuthenticationPrincipal OAuth2User user){

        String email = user.getAttribute("email");
        String name = user.getAttribute("name");

        return new User(email,name);
        }


    }

