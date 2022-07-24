package injection.resolution.by.factory.name.impl;

import injection.resolution.by.factory.name.Child;

public class FirstImpl implements Child {
    @Override
    public void someCoolStuffToDo() {
        System.out.println("Doing cool stuff in first impl");
    }
}
