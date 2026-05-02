package org.aop.practice8.starter;

import org.aop.practice8.config.Config;
import org.aop.practice8.services.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        try(context) {
            OrderService orderService = context.getBean(OrderService.class);
            orderService.processOrder();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}