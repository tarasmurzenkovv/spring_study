package injection.setter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("injection.setter")
                .getBean(Parent.class)
                .doSomething();
    }
}
