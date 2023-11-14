package com.barclays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BarclaysMessagingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarclaysMessagingAppApplication.class, args);
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
