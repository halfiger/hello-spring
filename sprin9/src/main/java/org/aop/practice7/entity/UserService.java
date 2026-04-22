package org.aop.practice7.entity;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    public void processRegistration (String username) {
        System.out.println("User registered: " + username);
    }

    public List<String> getUsers () {
        System.out.println("getting of users in getUsers method");
        return List.of("dada", "anna");
    }

    public String deleteAllUsers () {
        System.out.println("try to remove all users from db");
        return "all data removed";
    }
}