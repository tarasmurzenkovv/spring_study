package injection.multiple.list.of.impls;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("injection.multiple.list.of.impls")
                .getBean(Parent.class).doSomething();
    }
}
