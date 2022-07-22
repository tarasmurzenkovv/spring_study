package injection.resolution.by.primary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {
    @Bean
    public Child child() {
        return new FirstImpl();
    }

    @Bean
    @Primary
    public Child secondImpl() {
        return new SecondImpl();
    }
}
