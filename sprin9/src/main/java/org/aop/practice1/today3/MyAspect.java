package org.aop.practice1.today3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Around("execution(public void *Report ())")
    public Object reportAspect (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("START");

        Object targetMethodResult =
                proceedingJoinPoint.proceed();
        System.out.println("END");
        return targetMethodResult;
    }
}
