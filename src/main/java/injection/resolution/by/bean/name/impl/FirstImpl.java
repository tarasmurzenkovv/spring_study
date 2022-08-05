package injection.resolution.by.bean.name.impl;

import injection.resolution.by.bean.name.Child;

public class FirstImpl implements Child {
    @Override
    public void someCoolStuffToDo() {
        System.out.println("Doing cool stuff in first impl");
    }
}
