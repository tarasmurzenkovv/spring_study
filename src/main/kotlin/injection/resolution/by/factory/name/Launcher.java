package injection.resolution.by.factory.name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("injection.resolution.by.factory.name");
        context.getBean(Parent.class).doSomething();
    }
}
