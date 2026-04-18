package org.aop.practice4.t09;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        PaymentService service = new PaymentService();
        service.hasMoney();

        try {
            service.noMoney();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        finally {
            context.close();
        }

    }
}
