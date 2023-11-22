package ch.shukalovi.tranining.spring.springbootclassic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringBootClassicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootClassicApplication.class, args);
		log.info("Again, spring boot includes a bunch of the external stuff, which is fully compatible with each other, " +
				"so we won't need to include a lot of things as the dependency");
	}

}
