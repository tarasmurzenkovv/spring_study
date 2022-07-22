package injection.resolution.by.bean.name;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean("child")
    public Child someWiredName() {
        return new FirstImpl();
    }

    @Bean
    public Child secondImpl() {
        return new SecondImpl();
    }
}
