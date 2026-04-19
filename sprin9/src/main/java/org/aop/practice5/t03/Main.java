package org.aop.practice5.t03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        ReportService reportService = context.getBean(ReportService.class);
        reportService.generateReport();
        context.close();
    }
}
