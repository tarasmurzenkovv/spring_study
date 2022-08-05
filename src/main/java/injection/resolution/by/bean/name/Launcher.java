package injection.resolution.by.bean.name;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {
    public static void main(String[] args) {
        new AnnotationConfigApplicationContext("injection.resolution.by.bean.name")
                .getBean(Parent.class).doSomething();
    }
}
