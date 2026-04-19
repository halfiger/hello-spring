package org.aop.practice5.t10;

import org.springframework.stereotype.Component;

@Component
public class SlowService {
    public void slowMethod() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("print from slow method");
    }
}
