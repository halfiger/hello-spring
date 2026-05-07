package org.aop.practice1.today2;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void processPayment() {
        System.out.println("Payment done");
    }
}
