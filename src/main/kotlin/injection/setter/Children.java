package injection.setter;

import org.springframework.stereotype.Service;

@Service
public class Children {
    public void callMe() {
        System.out.println("Ho from children");
    }
}
