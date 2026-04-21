package org.aop.practice6.t03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        try (context) {
            ReportService report = context.getBean(ReportService.class);
            report.report();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}