package com.bridgelab.registrationloginspringbootsecurity;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class RegistrationLoginSpringbootSecurityApplication {

	public static void main(String[] args) {
		System.out.println("Welcome To Address Book Application");
		ApplicationContext context = SpringApplication.run(RegistrationLoginSpringbootSecurityApplication.class, args);
		log.info("UserRegistration App Started in {} Environment",
				context.getEnvironment().getProperty("environment"));
		log.info("UserRegistration App DB User is {}",
				context.getEnvironment().getProperty("spring.datasource.username"));
		log.info("UserRegistration App started");
	}

}
