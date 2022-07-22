package injection.resolution.by.type;

public class FirstImpl implements Child {
    @Override
    public void someCoolStuffToDo() {
        System.out.println("Doing cool stuff in first impl");
    }
}
