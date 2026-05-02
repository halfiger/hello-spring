package org.aop.practice8.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aop1 {
//    @Before("execution(* process*())")
//    public void beforeAspect () {
//        System.out.println("[SECURITY] Checking user before checkout");
//    }
}