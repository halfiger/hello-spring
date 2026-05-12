package org.aop.practice8.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class Aop15 {
//    @Before("execution(* * (..))")
//    public void loggingArguments (JoinPoint jp) {
//        Object[] array = jp.getArgs();
//        System.out.println(" in method " + jp.getSignature().getName() + " we have next args " + Arrays.toString(array));
//    }
}
