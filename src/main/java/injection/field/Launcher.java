package injection.field;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("injection.field")
                .getBean(Parent.class)
                .doSomething();
    }
}
