package injection.constructor;

import org.springframework.stereotype.Service;

@Service
public class Parent {
    private final Children children;

    public Parent(Children children) {
        this.children = children;
    }

    public void doSomething() {
        System.out.println("Constructor injection");
        children.callMe();
    }
}
