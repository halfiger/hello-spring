package org.aop.practice5.t08;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class Aop {
    @AfterReturning(pointcut = "execution(* org.aop.practice5.t08.Users.getUsers())", returning = "result")
    public void afterReturningLog (List<String> result) {
        System.out.println("Users count " + result.size());
    }

    @Around("execution(* org.aop.practice5.t08.Users.getUsers())")
    public List <String> changeResult (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        List <String> result = (List<String>) proceedingJoinPoint.proceed();
        List <String> mod = result.stream().map(String::toUpperCase).toList();
        return mod;
    }
}
