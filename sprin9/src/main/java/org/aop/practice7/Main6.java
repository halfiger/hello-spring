package org.aop.practice7;

import org.aop.practice7.entity.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        try (context) {
            //ReportService reportService = context.getBean(ReportService.class);
            //reportService.generateReport();

            PaymentService paymentService = context.getBean(PaymentService.class);
            paymentService.processPayment();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}