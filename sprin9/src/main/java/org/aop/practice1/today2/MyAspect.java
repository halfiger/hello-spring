package org.aop.practice1.today2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @After("execution(public void *Payment (..))")
    public void loggingAspect () {
        System.out.println("[LOG] Payment finished");
    }
}
