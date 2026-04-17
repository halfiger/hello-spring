package org.aop.practice4.t07;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
    @Before("execution(* org.aop.practice4.t07.p1..*())")
    public void aspectP1() {
        System.out.println("p1 Log");
    }

    @Before("execution(* org.aop.practice4.t07.p2..*())")
    public void aspectP2() {
        System.out.println("p2 Log");
    }

    @Before("!execution(* org.aop.practice4.t07.p1..*())")
    public void aspectP3() {
        System.out.println("p3 not p1 Log -->p2 log");
    }
}
