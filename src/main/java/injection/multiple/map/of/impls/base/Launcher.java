package injection.multiple.map.of.impls.base;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {
    public static void main(String[] args) {
                new AnnotationConfigApplicationContext("injection.multiple.map.of.impls.base")
                        .getBean(Parent.class).doSomething();
    }
}
