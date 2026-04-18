package org.aop.practice4.t10;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Aspect
@Component
public class Aop {
    @Around("execution(* *(..))")
        public Object timingAspect (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        LocalDateTime time1 = LocalDateTime.now();
        System.out.println("[LOG]START " + time1 + " for method: " + proceedingJoinPoint.getSignature().getName());
        Object result = proceedingJoinPoint.proceed();
        LocalDateTime time2 = LocalDateTime.now();
        long time = Duration.between(time1, time2).toMillis();
        System.out.println("[LOG]END, overall time " + time + " for method: " + proceedingJoinPoint.getSignature().getName());
        return result;
    }
}
