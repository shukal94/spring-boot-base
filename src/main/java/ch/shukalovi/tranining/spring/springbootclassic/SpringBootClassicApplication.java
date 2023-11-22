package ch.shukalovi.tranining.spring.springbootclassic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringBootClassicApplication {

	public static void main(String[] args) {
		log.info("HELLO!!!");
		SpringApplication.run(SpringBootClassicApplication.class, args);
	}

}
