package injection.multiple.list.of.impls;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Parent {
    private final List<Child> children;

    public Parent(List<Child> children) {
        this.children = children;
    }

    void doSomething(){
        children.forEach(Child::someCoolStuffToDo);
    }
}
