package org.aop.practice7.entity;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public int processPayment() {
        System.out.println("payment method from PaymentService class");
        return 1000;
    }
}
