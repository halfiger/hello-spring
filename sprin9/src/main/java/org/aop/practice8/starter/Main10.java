package org.aop.practice8.starter;

import org.aop.practice8.config.Config;
import org.aop.practice8.services.ReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main10 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        try(context) {

            ReportService paymentService = context.getBean(ReportService.class);
            paymentService.slowMethod();

        } catch (Exception e) {
            System.out.println("[*] message from main + " + e.getMessage());
        }
    }
}