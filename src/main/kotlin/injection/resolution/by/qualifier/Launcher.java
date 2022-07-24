package injection.resolution.by.qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("injection.resolution.by.qualifier")
                .getBean(Parent.class)
                .doSomething();
    }
}
