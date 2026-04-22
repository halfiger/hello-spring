package org.aop.practice7.entity;

import org.springframework.stereotype.Component;

@Component
public class ReportService {
    public void generateReport () {
        System.out.println("Generating report...");
    }
}
