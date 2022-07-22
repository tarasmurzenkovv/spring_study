package injection.resolution.by.type;

public class SecondImpl implements Child {
    @Override
    public void someCoolStuffToDo() {
        System.out.println("Doing cool stuff from second impl");
    }
}
