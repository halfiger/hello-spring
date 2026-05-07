package org.aop.practice1.today5;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Before("execution(* org.practice.today5.service1..*(..))")
        public void serviceAspect () {
            System.out.println("[APP LOG] method called:");
        }
}



/*
Альтернатива (чистіше через pointcut)

@Aspect
@Component
public class MyAspect {

    @Pointcut("execution(* org.practice.today1.service..*(..))")
    public void serviceLayer() {}

    @Before("serviceLayer()")
    public void logAllMethods() {
        System.out.println("[APP LOG] method called");
    }
}
*/