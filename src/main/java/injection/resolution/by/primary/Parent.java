package injection.resolution.by.primary;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Parent {

    private final Child child;

    public Parent(@Qualifier("secondImpl") Child child) {
        this.child = child;
    }

    void doSomething(){
        child.someCoolStuffToDo();
    }
}
