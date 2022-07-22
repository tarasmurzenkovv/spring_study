package injection.multiple.list.of.impls;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("injection.multiple.list.of.impls");
        context.getBean(Parent.class).doSomething();
    }
}
