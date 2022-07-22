package injection.multiple.list.of.impls;

import org.springframework.stereotype.Service;

@Service
public class SecondImpl implements Child {
    @Override
    public void someCoolStuffToDo() {
        System.out.println("Doing cool stuff from second impl");
    }
}
