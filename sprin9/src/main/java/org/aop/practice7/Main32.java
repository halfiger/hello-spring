package org.aop.practice7;

import org.aop.practice7.entity.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main32 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        try(context) {
            UserService userService = context.getBean(UserService.class);
            System.out.println(userService.getUser("1"));
            System.out.println(userService.getUser("2"));
            System.out.println(userService.getUser("3"));
            System.out.println(userService.getUser("1"));

        } catch (Exception ex) {
            System.out.println("LOG exeption " + ex.getMessage());
        }
    }
}
