package le.arn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan("le.arn")
public class WebAppInitializer {

	public static void main(String[] args) {
		SpringApplication.run(WebAppInitializer.class, args);
		System.out.println("Hello world.");
	}
}
