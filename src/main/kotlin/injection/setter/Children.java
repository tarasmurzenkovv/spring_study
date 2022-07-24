package injection.setter;

import org.springframework.stereotype.Service;

@Service
public class Children {
    public void callMe() {
        System.out.printf("Hi from child, child class is '%s'", this.getClass().getName());
    }
}
