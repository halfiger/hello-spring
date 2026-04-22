package org.aop.practice7;

import org.aop.practice7.entity.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        UserService userService = context.getBean(UserService.class);
        try (context) {
            userService.processRegistration("dada");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}