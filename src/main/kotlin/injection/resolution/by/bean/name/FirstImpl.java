package injection.resolution.by.bean.name;

public class FirstImpl implements Child {
    @Override
    public void someCoolStuffToDo() {
        System.out.println("Doing cool stuff in first impl");
    }
}
