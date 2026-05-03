package org.aop.practice8.services;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    public void register (String username) {
        System.out.println("User registered as: " + username);
    }

    public String description (String descr) {
        System.out.println("added description " + descr);
        return descr;
    }

    public List<String> getUsers () {
        return List.of("dada", "ada", "madaam");
    }



}
