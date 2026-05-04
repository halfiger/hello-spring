package org.aop.practice8.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Aspect
@Component
public class Aop10 {
//    @Around("execution(* *(..))")
//    public Object timeOfMethodExecution (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//
//        String methodName = proceedingJoinPoint.getSignature().getName();
//        LocalDateTime time1 = LocalDateTime.now();
//        Object o = proceedingJoinPoint.proceed();
//        LocalDateTime time2 = LocalDateTime.now();
//        long time = Duration.between(time1, time2).toMillis();
//        System.out.println("Time of " + methodName + " execution = " + time + " millis");
//        return o;
//    }
}
