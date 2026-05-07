package org.aop.practice1.today5;

import org.aop.practice1.today5.service2.UserService;
import org.aop.practice1.today5.service1.OrderService;
import org.aop.practice1.today5.service1.PaymentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        OrderService order = context.getBean(OrderService.class);
        PaymentService payment = context.getBean(PaymentService.class);
        UserService user = context.getBean(UserService.class);

        order.checkout();
        payment.processPayment();
        user.register("Alowa");

        context.close();
    }

}
