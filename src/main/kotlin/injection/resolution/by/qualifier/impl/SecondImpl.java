package injection.resolution.by.qualifier.impl;

import injection.resolution.by.qualifier.Child;

public class SecondImpl implements Child {
    @Override
    public void someCoolStuffToDo() {
        System.out.println("Doing cool stuff from second impl");
    }
}
