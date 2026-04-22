package org.aop.practice7.entity;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public int processPayment() {
        System.out.println("normal payment method from PaymentService class");
        return 1000;
    }
    public void failPayment() {
        System.out.println("fail payment method from PaymentService class");
        throw new IllegalStateException("payment fail -> message from exception");
    }

    public void slowMethod () throws InterruptedException {
        System.out.println("message from slowMethod in PaymentService class");
        Thread.sleep(500);
    }

}
