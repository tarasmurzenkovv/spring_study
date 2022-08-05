package injection.resolution.by.type.impl;

import injection.resolution.by.type.Child;

public class SecondImpl implements Child {
    @Override
    public void someCoolStuffToDo() {
        System.out.println("Doing cool stuff from second impl");
    }
}
