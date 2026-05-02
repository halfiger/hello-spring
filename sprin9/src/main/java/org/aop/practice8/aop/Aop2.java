package org.aop.practice8.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aop2 {
    @After("execution(* *Payment())")
    public void afterAspect () {
        System.out.println("[LOG] Payment finished");
    }
}
