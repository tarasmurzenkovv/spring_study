package injection.resolution.by.qualifier;

public class FirstImpl implements Child {
    @Override
    public void someCoolStuffToDo() {
        System.out.println("Doing cool stuff in first impl");
    }
}
