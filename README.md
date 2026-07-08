
# Secure User Authentication Backend
A secure Spring Boot backend that authenticates users with Google OAuth 2.0 and manages user data using Spring Security and Spring Data JPA.

The project demonstrates modern backend development practices, including OAuth2 authentication, role-based authorization, REST API development, database persistence, Docker containerization, and automated testing with JUnit 5 and Mockito.

Authenticated users can sign in with their Google account, retrieve their profile information, and have their data securely stored in the application's database.


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
