package org.aop.practice8.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class Aop8 {
    @AfterReturning (pointcut = "execution(* *(..))",
    returning = "retData")
    public void returningAdvice (List<String> retData) {
        System.out.println("Users count: " + retData.size());
    }

    @Around("execution(* *())")
    public Object bonus (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("redaguemo useriv u pointcuti ");
        List <String> list = (List<String>) proceedingJoinPoint.proceed();
        return list.stream().map(String::toUpperCase).toList();
    }
}
