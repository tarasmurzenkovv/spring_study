package injection.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Parent {
    @Autowired
    private Children children;


    public void doSomething() {
        System.out.println("Setter injection");
        children.callMe();
    }

    public void setChildren(Children children) {
        this.children = children;
    }
}
