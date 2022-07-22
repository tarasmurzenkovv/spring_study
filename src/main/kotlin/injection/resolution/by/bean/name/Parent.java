package injection.resolution.by.bean.name;

import org.springframework.stereotype.Service;

@Service
public class Parent {
    private final Child child;

    public Parent(Child child) {
        this.child = child;
    }

    void doSomething(){
        child.someCoolStuffToDo();
    }
}
