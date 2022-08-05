package injection.resolution.by.factory.name;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("injection.resolution.by.factory.name")
                .getBean(Parent.class).doSomething();
    }
}
