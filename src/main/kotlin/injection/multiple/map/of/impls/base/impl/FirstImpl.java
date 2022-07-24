package injection.multiple.map.of.impls.base.impl;

import injection.multiple.map.of.impls.base.Child;
import org.springframework.stereotype.Service;

@Service
public class FirstImpl implements Child {
    @Override
    public void someCoolStuffToDo() {
        System.out.printf("Hi from first child, child class is '%s' \n", this.getClass().getName());
    }
}
