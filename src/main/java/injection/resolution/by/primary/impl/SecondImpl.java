package injection.resolution.by.primary.impl;

import injection.resolution.by.primary.Child;

public class SecondImpl implements Child {
    @Override
    public void someCoolStuffToDo() {
        System.out.println("Doing cool stuff from second impl");
    }
}
