package org.aop.practice8.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop12 {
    @Before("!execution(* delete*(..))" )
    public void excludeMethod() {
        System.out.println("LOG1 - not delete method");
    }

    @Before("execution(* process*(..)) || execution(* slow*(..))" )
    public void includeMethod() {
        System.out.println("LOG2 - just log method");
    }
}
