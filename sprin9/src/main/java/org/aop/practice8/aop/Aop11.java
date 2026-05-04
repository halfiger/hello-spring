package org.aop.practice8.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop11 {
    @Around("execution(* delete*())")
    public Object blockDangerousMethod (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        String methodName = proceedingJoinPoint.getSignature().getName();

            if (methodName.contains("delete")) {
                System.out.println("[AOP] blocking method: " + methodName);
                throw new IllegalArgumentException ("danger blocked");
            }
        return proceedingJoinPoint.proceed();
    }

}
