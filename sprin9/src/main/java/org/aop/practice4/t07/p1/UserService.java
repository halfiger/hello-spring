package org.aop.practice4.t07.p1;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public void hello () {
        System.out.println("hello from p1");
    }
}
