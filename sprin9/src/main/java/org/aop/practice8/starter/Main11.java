package org.aop.practice8.starter;

import org.aop.practice8.config.Config;
import org.aop.practice8.services.ReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main11 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        try(context) {

            ReportService paymentService = context.getBean(ReportService.class);
            System.out.println(paymentService.deleteDB());

        } catch (Exception e) {
            System.out.println("[*] message from main + " + e.getMessage());
        }
    }
}