package org.aop.practice8.services;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public void processOrder() {
        System.out.println("order method from OrderService class");
    }
}
