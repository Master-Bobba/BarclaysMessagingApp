package com.barclays;

import com.barclays.util.MessagePopulator;
import com.barclays.util.PersonPopulator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BarclaysMessagingAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BarclaysMessagingAppApplication.class, args);

		MessagePopulator populator = context.getBean("messagePopulator", MessagePopulator.class);
		populator.populate();

		PersonPopulator personPopulator = context.getBean("personPopulator", PersonPopulator.class);
		personPopulator.populate();
	}

}


/**
 * Quite useful docs stuff for all commands of the API
 *
 * Need to add the below dependency
 * and open the following website:
 * http://localhost:8080/swagger-ui/index.html
 */
//<dependency>
//<groupId>org.springdoc</groupId>
//<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
//<version>2.2.0</version>
//</dependency>
