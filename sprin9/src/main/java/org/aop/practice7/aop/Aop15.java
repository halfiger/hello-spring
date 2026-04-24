package org.aop.practice7.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class Aop15 {
    @Before("execution(* *..createUser(..))")
    public void argAdvice (JoinPoint joinPoint) {
        Object [] args = joinPoint.getArgs();
        System.out.println("[LOG] Method " + joinPoint.getSignature().getName());
        System.out.println("[LOG] ARGS name = " + Arrays.toString(args));
    }
}