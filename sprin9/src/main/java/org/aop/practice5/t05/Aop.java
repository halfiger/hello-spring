package org.aop.practice5.t05;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
    @After("execution(* org.aop.practice5.t05.pac..*(..))")
        public void logFromPac() {
        System.out.println("[LOG] from [PAC]");
    }

    @After("!execution(* org.aop.practice5.t05.pac..*(..))")
    public void logExceptPac() {
        System.out.println("[LOG] except [PAC]");
    }
}
