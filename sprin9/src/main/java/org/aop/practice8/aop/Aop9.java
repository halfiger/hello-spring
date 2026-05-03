package org.aop.practice8.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop9 {
//    @AfterThrowing(pointcut = "execution(* *(..))",
//            throwing = "ex")
//    public void afterThrowingAdvice(Exception ex) {
//        try {
//            System.out.println("we get the exception from method " + ex.getMessage());
//
//        } catch (IllegalStateException e) {
//            System.out.println("we get the exception from method " + e.getMessage());
//            throw new IllegalStateException(e.getMessage());
//        }
//    }
}
