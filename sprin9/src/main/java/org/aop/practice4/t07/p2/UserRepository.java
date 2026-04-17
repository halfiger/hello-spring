package org.aop.practice4.t07.p2;

import org.springframework.stereotype.Component;

@Component
public class UserRepository {
    public void hello () {
        System.out.println("hello from p2");
    }
}
