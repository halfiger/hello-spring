package org.aop.practice8.services;

import org.springframework.stereotype.Component;

@Component
public class ReportService {
    public void processReport() {
        System.out.println("processing report");
    }

    public void slowMethod () throws InterruptedException {
        System.out.println("Message from slow method");
        Thread.sleep(500);
    }

    public String deleteDB () {
        System.out.println("try to delete DB");
        return "DB deleted";
    }
}