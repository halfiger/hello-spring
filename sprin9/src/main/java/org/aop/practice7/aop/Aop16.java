package org.aop.practice7.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop16 {
    @Around("execution(* *(String))")
    public Object blockAdvice (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object [] args = proceedingJoinPoint.getArgs();
        String name = (String)args[0];
        if (name == null || name.isEmpty()) {
            return null;
        }
        return proceedingJoinPoint.proceed();
    }
}
