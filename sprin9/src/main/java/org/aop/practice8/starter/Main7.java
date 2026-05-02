package org.aop.practice8.starter;

import org.aop.practice8.config.Config;
import org.aop.practice8.services.UserService;
import org.aop.practice8.services.pac1.PackageService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main7 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        try(context) {
            PackageService packageService = context.getBean(PackageService.class);
            packageService.packing();

            UserService userService = context.getBean(UserService.class);
            userService.register("dada");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}