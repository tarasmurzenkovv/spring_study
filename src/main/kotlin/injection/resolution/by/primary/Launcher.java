package injection.resolution.by.primary;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("injection.resolution.by.primary")
                .getBean(Parent.class).doSomething();
    }
}
