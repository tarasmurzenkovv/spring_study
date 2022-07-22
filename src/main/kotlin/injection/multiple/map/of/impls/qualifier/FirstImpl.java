package injection.multiple.map.of.impls.qualifier;

import org.springframework.stereotype.Service;

@Service("1st impl")
public class FirstImpl implements Child {
    @Override
    public void someCoolStuffToDo() {
        System.out.println("Doing cool stuff in first impl");
    }
}
