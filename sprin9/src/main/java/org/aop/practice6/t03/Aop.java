package org.aop.practice6.t03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Aspect
@Component
public class Aop {
    @Around("execution(* report())")
    public Object timeAspect (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("[Start]");
        LocalDateTime time1 = LocalDateTime.now();
        Object o = proceedingJoinPoint.proceed();
        LocalDateTime time2 = LocalDateTime.now();
        Long time = Duration.between(time1, time2).toMillis();
        System.out.println("[End] method's time = " + time);
        return o;
    }
}
