package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class mockTesting {

    //Fake repository
    @Mock
    private UserRepository userRepository;

    //Injects the fake repository in the service
    @InjectMocks
    private UserService userService;

    //Running the tests
    @Test
    public void FakeRepoTest() {

        //create  fake google user
        OAuth2User oAuth2User = mock(OAuth2User.class);

        User existingUser=new User("walterwhte112@gmail.com","Safwan");

        //teaching it how to behave
        when(oAuth2User.getAttribute("email"))
                .thenReturn("walterwhte112@gmail.com");

        when(oAuth2User.getAttribute("name"))
                .thenReturn("Safwan");

        //if email already exists then hte database already know it's user.
        when(userRepository.findByEmail("walterwhte112@gmail.com"))
                .thenReturn(Optional.of(existingUser));

        /** 1 Act */
        //this is the line we're testing .
        User result = userService.processGoogleUser(oAuth2User);

        assertEquals(existingUser, result);

        verify(userRepository).findByEmail("walterwhte112@gmail.com");

    }


}
