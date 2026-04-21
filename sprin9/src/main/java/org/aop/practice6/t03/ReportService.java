package org.aop.practice6.t03;

import org.springframework.stereotype.Component;

@Component
public class ReportService    {
    public void report () throws InterruptedException {
        System.out.println("Generate report");
        Thread.sleep(500);
    }
}