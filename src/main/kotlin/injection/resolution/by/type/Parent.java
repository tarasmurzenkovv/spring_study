package injection.resolution.by.type;

import org.springframework.stereotype.Service;

@Service
public class Parent {

    private final Child child;

    public Parent(FirstImpl child) {
        this.child = child;
    }

    void doSomething() {
        child.someCoolStuffToDo();
    }
}
