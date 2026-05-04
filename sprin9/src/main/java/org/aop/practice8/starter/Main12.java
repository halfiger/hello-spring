package org.aop.practice8.starter;

import org.aop.practice8.config.Config;
import org.aop.practice8.services.ReportService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main12 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        try(context) {

            ReportService reportService = context.getBean(ReportService.class);
            reportService.processReport();
            reportService.deleteDB();
            reportService.slowMethod();

        } catch (Exception e) {
            System.out.println("[*] message from main + " + e.getMessage());
        }
    }
}