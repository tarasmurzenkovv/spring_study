package injection.resolution.by.qualifier.impl;

import injection.resolution.by.qualifier.Child;

public class FirstImpl implements Child {
    @Override
    public void someCoolStuffToDo() {
        System.out.println("Doing cool stuff in first impl");
    }
}
