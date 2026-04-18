package org.aop.practice4.t09;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {
    @AfterThrowing (
            pointcut = "execution(* org.aop.practice4.t09.PaymentService.pay(..))",
            throwing = "ex"
    )
    public void afterThrowingAspect (IllegalStateException ex) {
        System.out.println("[EXCEPTION] in method " + ex.getMessage());
    }
}
