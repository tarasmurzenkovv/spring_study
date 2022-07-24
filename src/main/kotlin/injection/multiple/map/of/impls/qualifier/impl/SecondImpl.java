package injection.multiple.map.of.impls.qualifier.impl;

import injection.multiple.map.of.impls.qualifier.Child;
import org.springframework.stereotype.Service;

@Service("2nd impl")
public class SecondImpl implements Child {
    @Override
    public void someCoolStuffToDo() {
        System.out.printf("Hi from second child, child class is '%s' \n", this.getClass().getName());
    }
}
