package org.aop.practice7.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Aspect
@Component
public class Aop1 {

    /*
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

    @After ("execution(* org.aop.practice7.entity.p1..*(..))")
    public void packageAdvice () {
        System.out.println("Advice worked only in p1 folder");
    }

    @After("execution(String *(..))" )
    public void returnValueStringeAdvice () {
        System.out.println("[LOG] returned String value");
    }

    @After("execution(int *(..))" )
    public void returnValueIntAdvice () {
        System.out.println("[LOG] returned int value");
    }

    @After("!execution(* org.aop.practice7.entity.p1.*.*())")
    public void exceptFolderAdvice () {
        System.out.println("[LOG] not from p1 folder advice");
    }


    //All methods in package
    @Pointcut("execution(* org.aop.practice7.entity..*(..))")
    public void allMethods() {
        System.out.println("all method's pointcut");
    }

    //Only p1 package
    @Pointcut("execution(* org.aop.practice7.entity.p1..*.*(..))")
    public void p1Package() {
        System.out.println("only p1 method's pointcut");
    }

    //ExceptP1 package
    @Pointcut("allMethods() && !p1Package()")
    public void exceptP1() {
        System.out.println("except p1 pointcut");
    }

    @After("exceptP1()")
    public void ExceptFolderAdvice2 () {
        System.out.println("[LOG] not from p1 folder advice");
    }
     */

    @AfterReturning (pointcut = "allEntityMethods()",
            returning = "result")
    public void returningAdvice (List<String> result) {
        System.out.println("Users = " + result);
        System.out.println("[Log] number of users " + result.size());
    }

    @Pointcut("execution(* org.aop.practice7.entity..*())")
    public void allEntityMethods() {
        System.out.println("Pointcut all methods");
    }
}
