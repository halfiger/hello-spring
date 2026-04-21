package org.aop.practice6.t05;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
    @After("execution(* org.aop.practice6.t05.p1.OrderService..*(..))")
    public void aopFolderSeparationOfMethods () {
        System.out.println("Log aop from p1");
    }
}
