package org.aop.practice7;

import org.aop.practice7.entity.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        PaymentService paymentService = context.getBean(PaymentService.class);
        try (context) {
            paymentService.processPayment();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}