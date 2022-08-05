package injection.resolution.by.type;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("injection.resolution.by.type")
                .getBean(Parent.class).doSomething();
    }
}
