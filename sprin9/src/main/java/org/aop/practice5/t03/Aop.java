package org.aop.practice5.t03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
    @Around("execution(* *Report())")
    public Object aspectReport(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("START");
        Object o = proceedingJoinPoint.proceed();
        System.out.println("END");
        return 0;
    }
}
