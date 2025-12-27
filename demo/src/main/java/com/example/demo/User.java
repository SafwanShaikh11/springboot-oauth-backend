package com.example.demo;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Column(nullable = false,unique = true)
    String email;
    String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    public User(String email, String name){
        this.email=email;
        this.name=name;
    }
    public String getEmail(){
        return email;
    }

    public String getName() {
        return name;
    }
}
