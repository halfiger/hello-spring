package org.aop.practice6.t08;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
public class Aop {
    @AfterReturning (pointcut = "execution(* get*())",
    returning = "list")
    public void aopReturningTest (List<String> list) {
        System.out.println("count of users : " + list.size());
    }

    @Around("execution(* get*(..))")
    public Object aopChangeReturnValue (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        List <String> list = (List<String>)proceedingJoinPoint.proceed();
        List <String> mod = list.stream().map(a->a.toUpperCase()).toList();
        return mod;
    }
}

