package org.aop.practice6.t04;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public void register(String username) {
        System.out.println("User registered: " + username);
    }
}
