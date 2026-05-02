package org.aop.practice8.services;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void processPayment() {
        System.out.println("Process payment method");
    }
}
