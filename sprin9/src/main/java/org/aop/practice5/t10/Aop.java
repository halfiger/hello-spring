package org.aop.practice5.t10;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Aspect
@Component
public class Aop {
    @Around("execution(* org.aop.practice5.t10.SlowService.slowMethod())")
    public Object methodTimeCalcLogging(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String methodName = proceedingJoinPoint.getSignature().getName();
        LocalDateTime start = LocalDateTime.now();

        System.out.println("[Start] of " + methodName);

        Object o = proceedingJoinPoint.proceed();
        LocalDateTime end = LocalDateTime.now();
        Long time = Duration.between(start, end).toMillis();
        System.out.println("[End] of " + methodName + " for Millis : " + time);
        return o;
    }
}
