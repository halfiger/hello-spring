package org.aop.practice1.today4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UserService service = context.getBean(UserService.class);
        service.register("Alowa");
        context.close();
    }
}

/* або ось так, трохи низькорівнево
@Before("execution(* register(..))")
public void logBefore(JoinPoint joinPoint) {
    Object[] args = joinPoint.getArgs();
    String username = (String) args[0];
    System.out.println("[LOG] Registering user: " + username);
}
🧠 Що тут відбувається:

joinPoint.getArgs() → всі аргументи методу
args[0] → перший аргумент (username)
*/