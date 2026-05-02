package org.aop.practice8.starter;

import org.aop.practice8.config.Config;
import org.aop.practice8.services.OrderService;
import org.aop.practice8.services.PaymentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        try(context) {

            PaymentService paymentService = context.getBean(PaymentService.class);
            paymentService.processPayment();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}