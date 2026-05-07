package org.aop.practice1.today2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        PaymentService payment = context.getBean("paymentService", PaymentService.class);
        payment.processPayment();
        context.close();
    }
}