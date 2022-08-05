package injection.constructor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("injection.constructor")
                .getBean(Parent.class)
                .doSomething();
    }
}
