package org.aop.practice4.t09;

import org.springframework.stereotype.Component;
@Component
public class PaymentService {
    public void noMoney () {
        System.out.println("Payment failed");
        throw new IllegalStateException("Illegal State Exception");
    }
    public void hasMoney () {
        System.out.println("has money method");
    }
}