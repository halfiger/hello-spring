package org.aop.practice6.t05;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public void login () {
        System.out.println("user loged in");
    }
}
