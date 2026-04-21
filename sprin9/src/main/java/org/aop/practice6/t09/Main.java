package org.aop.practice6.t09;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        try (context) {
            UserService service = context.getBean(UserService.class);
            service.failPay();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}