package injection.resolution.by.bean.name;

public class SecondImpl implements Child {
    @Override
    public void someCoolStuffToDo() {
        System.out.println("Doing cool stuff from second impl");
    }
}