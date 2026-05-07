package org.aop.practice1.today1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(MyConfig.class);
        OrderService service = context.getBean(OrderService.class);
        service.checkout();
        context.close();
    }
}
