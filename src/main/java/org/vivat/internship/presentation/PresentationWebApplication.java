package org.vivat.internship.presentation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = {
		SecurityAutoConfiguration.class
})
public class PresentationWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(PresentationWebApplication.class, args);
	}

}
