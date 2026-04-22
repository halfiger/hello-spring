package org.aop.practice7.entity;

import org.springframework.stereotype.Component;

@Component
public class ReportService {
    public String generateReport () {
        System.out.println("Generating report...");
        return "formed report";
    }
}
