package le.arn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebApplication {

	final static Logger logger = LoggerFactory
			.getLogger(SpringBootWebApplication.class);

	public static void main(String[] args) throws Exception {
		logger.debug("Springboot booting up ...");
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

}
