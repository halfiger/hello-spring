package org.aop.practice6.t09;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public void failPay() {
        throw new IllegalStateException("Payment failed");
    }
}
