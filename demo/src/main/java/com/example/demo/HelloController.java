package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    //
    @GetMapping("/health")
    public Map<String, String> health(){
        Map<String,String> response= new HashMap<>();
        response.put("status","UP");
        return response;
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello, authenticated user";
    }


}
