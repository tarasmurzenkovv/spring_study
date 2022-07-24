package injection.multiple.map.of.impls.qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("injection.multiple.map.of.impls.qualifier")
                .getBean(Parent.class).doSomething();
    }
}
