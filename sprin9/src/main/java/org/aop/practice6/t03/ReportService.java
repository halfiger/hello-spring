package org.aop.practice6.t03;

import org.springframework.stereotype.Component;

@Component
public class ReportService    {
    public void report () {
        System.out.println("Generate report");
    }
}