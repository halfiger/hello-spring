package org.aop.practice1.today5.service1;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void processPayment() {
        System.out.println("Payment done");
    }
}
