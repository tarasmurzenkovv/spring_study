package injection.resolution.by.bean.name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("injection.resolution.by.bean.name");
        context.getBean(Parent.class).doSomething();
    }
}
