package org.aop.practice1.today3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        ReportService service = context.getBean(ReportService.class);
        service.generateReport();
        context.close();
    }
}