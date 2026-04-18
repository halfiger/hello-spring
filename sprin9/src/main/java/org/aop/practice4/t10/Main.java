package org.aop.practice4.t10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Service service = context.getBean(Service.class);

        try {
            service.running();
        } catch (InterruptedException e) {
            System.out.println("exception handled");
        } finally {
            context.close();
        }
    }
}
