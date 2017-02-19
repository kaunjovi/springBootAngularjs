package le.arn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	final static Logger logger = LoggerFactory.getLogger(MainController.class);

	@RequestMapping("/")
	String homepage() {

		// (https://examples.javacodegeeks.com/enterprise-java/spring/boot/spring-boot-and-angularjs-integration-tutorial/)
		// You need to overwrite SpringBoot's setting of logback if you want the
		// debug messages to show up.
		logger.debug("The homepage is hit.");
		return "index";
	}

}
