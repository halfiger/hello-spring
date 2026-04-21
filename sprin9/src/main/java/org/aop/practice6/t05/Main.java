package org.aop.practice6.t05;

import org.aop.practice6.t05.p1.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        OrderService order = context.getBean(OrderService.class);
        UserService user = context.getBean(UserService.class);
            order.order();
            user.login();
        context.close();
    }
}
