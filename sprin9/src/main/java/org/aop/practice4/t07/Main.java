
package org.aop.practice4.t07;

import org.aop.practice4.t07.p1.UserService;
import org.aop.practice4.t07.p2.UserRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        UserService userService = context.getBean(UserService.class);
        UserRepository userRepository = context.getBean(UserRepository.class);
        userService.hello();
        userRepository.hello();
        //context.close();
    }

}
