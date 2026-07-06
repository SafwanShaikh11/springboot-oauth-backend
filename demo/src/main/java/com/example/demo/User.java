package com.example.demo;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")


public class User {
    @Column(nullable = false, unique = true)
    String email;
    String name;
    private String role;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    protected User() {

    }

    public User(String email, String name) {
        this.email = email;
        this.name = name;
        this.role = "USER";
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }
    public String getRole() {
        return role;
    }
}
