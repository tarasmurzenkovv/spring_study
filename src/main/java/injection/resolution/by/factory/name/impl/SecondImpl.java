package injection.resolution.by.factory.name.impl;

import injection.resolution.by.factory.name.Child;

public class SecondImpl implements Child {
    @Override
    public void someCoolStuffToDo() {
        System.out.println("Doing cool stuff from second impl");
    }
}
