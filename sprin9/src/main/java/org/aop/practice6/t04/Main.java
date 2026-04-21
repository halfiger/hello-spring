package org.aop.practice6.t04;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        UserService user = context.getBean(UserService.class);
        user.register("dada");
    }
}
