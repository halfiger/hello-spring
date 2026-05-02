package org.aop.practice8.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop7 {
    @After("!execution(* org.aop.practice8.services.pac1..*(..))")
    public void excludePac1 () {
        System.out.println("excluding package methods");
    }
}
