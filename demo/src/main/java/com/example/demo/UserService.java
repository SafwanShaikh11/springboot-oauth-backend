package com.example.demo;

import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserService {


private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User processGoogleUser(OAuth2User user){
        String email = user.getAttribute("email");
        String name = user.getAttribute("name");

        return userRepository.findByEmail(email)
                .orElseGet(() -> userRepository.save(new User(email,name)));

    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }



}
