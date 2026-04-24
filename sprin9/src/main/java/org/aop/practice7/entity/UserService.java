package org.aop.practice7.entity;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    public void processRegistration (String username) {
        System.out.println("User registered: " + username);
    }

    public List<String> getUsers () {
        System.out.println("getting users in getUsers method");
        return List.of("dada", "anna");
    }

    public void saveUser () {
        System.out.println("save method in UserService class");
    }

    public String deleteAllUsers () {
        System.out.println("try to remove all users from db");
        return "all data removed";
    }

    public void updateUser (String username) {
        System.out.println("try to update username, new username = " + username);
    }

    public void createUser (String name, int age) {
        System.out.println("User created, name = " + name + " , age = " + age);
    }
}