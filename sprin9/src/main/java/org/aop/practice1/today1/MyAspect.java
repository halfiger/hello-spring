package org.aop.practice1.today1;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
@Before("execution(public void check* ())")
public void checkAspect () {
        System.out.println("[SECURITY] Checking user before checkout");
    }
}
