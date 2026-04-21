package org.aop.practice6.t04;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
    @After("execution(* register(String)) && args(username)")
    public void aspectUserRegistrationName (String username) {
        System.out.println("registered username = " + username);
    }
}