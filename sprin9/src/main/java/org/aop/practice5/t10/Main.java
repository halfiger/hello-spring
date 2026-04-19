package org.aop.practice5.t10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SlowService service = context.getBean(SlowService.class);
        service.slowMethod();
        context.close();
    }
}
