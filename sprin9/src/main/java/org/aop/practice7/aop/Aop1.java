package org.aop.practice7.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Aspect
@Component
public class Aop1 {
    @Before("execution(* org.aop.practice7.entity.OrderService.*Order*(..))")
    public void beforeAdvice () {
        System.out.println("[SECURITY] Checking user before checkout");
    }

    @After("execution(* org.aop.practice7.entity.PaymentService.*Pay*(..))")
    public void afterAdvice () {
        System.out.println("[SECURITY] Checking user after checkout");
    }

    @Around("execution(* org.aop.practice7.entity.ReportService.*Report*(..))")
    public Object aroundAdvice (ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("[Start] at " + LocalDateTime.now());
        Object o = joinPoint.proceed();
        System.out.println("[End] at " + LocalDateTime.now());
        return o;
    }

    @After("execution(* org.aop.practice7.entity.UserService.*Registr*(String)) && args(username)")
    public void argsAdvice(String username) {
        System.out.println("[LOG] Registering user: " + username);
    }
}
