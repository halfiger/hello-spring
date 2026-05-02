package org.aop.practice8.services;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public void register (String username) {
        System.out.println("User registered as: " + username);
    }

    public String description (String descr) {
        System.out.println("added description " + descr);
        return descr;
    }

}
