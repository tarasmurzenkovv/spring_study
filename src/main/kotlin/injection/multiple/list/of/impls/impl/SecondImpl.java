package injection.multiple.list.of.impls.impl;

import injection.multiple.list.of.impls.Child;
import org.springframework.stereotype.Service;

@Service
public class SecondImpl implements Child {
    @Override
    public void someCoolStuffToDo() {
        System.out.printf("Hi from second child, child class is '%s' \n", this.getClass().getName());
    }
}
