package injection.multiple.map.of.impls.qualifier.impl;

import injection.multiple.map.of.impls.qualifier.Child;
import org.springframework.stereotype.Service;

@Service("1st impl")
public class FirstImpl implements Child {
    @Override
    public void someCoolStuffToDo() {
        System.out.printf("Hi from first child, child class is '%s' \n", this.getClass().getName());
    }
}
