package injection.resolution.by.qualifier;

import injection.resolution.by.qualifier.impl.FirstImpl;
import injection.resolution.by.qualifier.impl.SecondImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Child child() {
        return new FirstImpl();
    }

    @Bean
    public Child secondImpl() {
        return new SecondImpl();
    }
}
