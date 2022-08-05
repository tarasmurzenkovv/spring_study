package injection.resolution.by.type.impl;

import injection.resolution.by.type.Child;

public class FirstImpl implements Child {
    @Override
    public void someCoolStuffToDo() {
        System.out.println("Doing cool stuff in first impl");
    }
}
