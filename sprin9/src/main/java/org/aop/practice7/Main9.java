package org.aop.practice7;

import org.aop.practice7.entity.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main9 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        try (context) {
            PaymentService paymentService = context.getBean(PaymentService.class);
            paymentService.processPayment();
            paymentService.failPayment();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage() + " -> message from Main");
        }
    }
}