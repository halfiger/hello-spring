package org.aop.practice1.today3;

import org.springframework.stereotype.Component;

@Component ()
public class ReportService {
    public void generateReport() {
        System.out.println("Generating report...");
    }
}
