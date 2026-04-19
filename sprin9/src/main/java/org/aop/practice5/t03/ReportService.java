package org.aop.practice5.t03;

import org.springframework.stereotype.Component;

@Component
public class ReportService {
    public void generateReport () {
        System.out.println("generating of report");
    }
}
