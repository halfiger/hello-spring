package org.aop.practice7;

import org.aop.practice7.entity.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        OrderService orderService = context.getBean(OrderService.class);
        try (context) {
            orderService.checkout();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}