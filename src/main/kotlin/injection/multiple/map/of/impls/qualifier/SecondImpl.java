package injection.multiple.map.of.impls.qualifier;

import org.springframework.stereotype.Service;

@Service("2nd impl")
public class SecondImpl implements Child {
    @Override
    public void someCoolStuffToDo() {
        System.out.println("Doing cool stuff from second impl");
    }
}
