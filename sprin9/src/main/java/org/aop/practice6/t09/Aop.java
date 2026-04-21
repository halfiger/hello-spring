package org.aop.practice6.t09;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
    @AfterThrowing(pointcut = "execution(* *Pay())", throwing = "ex")
    public void aopThrowedExceptionLogging (IllegalStateException ex) throws Throwable {
        System.out.println("[Exception log] " + ex.getMessage());
    }
}
