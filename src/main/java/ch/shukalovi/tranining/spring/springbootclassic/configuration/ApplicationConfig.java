package ch.shukalovi.tranining.spring.springbootclassic.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.thirdparty.UserConfig;
import org.thirdparty.UserService;

@Configuration
public class ApplicationConfig {

    @Value("${services.user.name}")
    private String name;

    @Bean
    public UserService userService() {
        return new UserService(name);
    }
}
