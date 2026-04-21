package org.aop.practice6.t03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
    @Around("execution(* report())")
    public Object timeAspect (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("[Start]");
        Object o = proceedingJoinPoint.proceed();
        System.out.println("[End]");
        return o;
    }
}
