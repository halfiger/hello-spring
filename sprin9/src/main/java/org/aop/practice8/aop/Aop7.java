package org.aop.practice8.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop7 {
    @After("excludePac()")
    public void excluding () {
        System.out.println("excluding package methods");
    }

    @Pointcut("execution(* org.aop.practice8.services.pac1..*(..))")
    public void excludePac () {}
}