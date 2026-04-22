package org.aop.practice7.entity;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public void processRegistration (String username) {
        System.out.println("User registered: " + username);
    }
}