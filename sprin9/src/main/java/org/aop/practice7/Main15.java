package org.aop.practice7;

import org.aop.practice7.entity.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main15 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        try (context) {
            UserService userService = context.getBean(UserService.class);
            userService.createUser("dada", 11);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}