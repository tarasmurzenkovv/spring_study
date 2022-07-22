package injection.multiple.map.of.impls.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("injection.multiple.map.of.impls.base");
        context.getBean(Parent.class).doSomething();
    }
}
