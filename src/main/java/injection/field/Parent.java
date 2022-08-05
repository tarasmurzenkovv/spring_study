package injection.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Parent {
    @Autowired
    private Children children;


    public void doSomething() {
        System.out.println("Field injection");
        children.callMe();
    }
}
