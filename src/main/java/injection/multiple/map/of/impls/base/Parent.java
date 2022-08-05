package injection.multiple.map.of.impls.base;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class Parent {
    private final Map<String, Child> children;

    public Parent(Map<String, Child> children) {
        this.children = children;
    }

    void doSomething(){
        children.forEach((k, v)-> {
            System.out.printf("Key is '%s'. Result of call method is: ", k);
            v.someCoolStuffToDo();
        });
    }
}
