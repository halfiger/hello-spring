package org.aop.practice4.t10;

import org.springframework.stereotype.Component;

@Component
public class Service {
    public void running() throws InterruptedException {
        System.out.println("Running");
        Thread.sleep(500);
    }
}
