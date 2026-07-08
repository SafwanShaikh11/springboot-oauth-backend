
# Secure User Authentication Backend

A Spring Boot backend application that authenticates users through Google OAuth 2.0 and persists user information using Spring Data JPA.

The project was built to explore modern backend development practices including authentication, authorization, dependency injection, REST APIs, object-relational mapping (ORM), and database persistence.

Currently, authenticated users can sign in with their Google account, have their profile information retrieved, and be stored in the application's database.

## Technologies

* Java 21
* Spring Boot 3
* Spring Security
* OAuth 2.0 (Google Login)
* PostgreSQL / H2 Database
* Spring Data JPA
* H2 Database
* Maven
* Docker
* JUnit 5
* Mockito
* Docker
* Git & GitHub

## Current Features

* Google OAuth 2.0 authentication
* Protected REST endpoints
* User profile retrieval from Google
* User persistence using Spring Data JPA
* Duplicate-user prevention through email-based lookup
* H2 in-memory database integration
* Repository pattern implementation
* Unit and integration testing with JUnit 5, Mockito, and Spring Boot Test
