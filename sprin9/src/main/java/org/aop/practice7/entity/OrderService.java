package org.aop.practice7.entity;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    public void checkout() {
        System.out.println("checkout method from OrderService class");
    }
}
