package org.aop.practice1.today4;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
    @Before("execution(* register(..)) && args(username)")
    public void logBefore(String username) {
        System.out.println("[LOG] Registering user: " + username);
    }


}
