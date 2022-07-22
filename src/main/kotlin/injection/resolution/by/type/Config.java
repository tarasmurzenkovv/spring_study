package injection.resolution.by.type;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public FirstImpl child() {
        return new FirstImpl();
    }

    @Bean
    public Child secondImpl() {
        return new SecondImpl();
    }
}
