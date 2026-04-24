package org.aop.practice7.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(10)
public class LoggingAspect {
    @Around("execution(* *())")
    public Object logingAspect (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("[Login] logging");
        return proceedingJoinPoint.proceed();
    }
}