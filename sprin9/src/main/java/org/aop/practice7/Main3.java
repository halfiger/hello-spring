package org.aop.practice7;

import org.aop.practice7.entity.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        ReportService reportService = context.getBean(ReportService.class);
        try (context) {
            reportService.generateReport();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}