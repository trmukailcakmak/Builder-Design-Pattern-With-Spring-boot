package com.cakmak.designPattern.builder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		Person person = new Person.Builder().name("Tuğrul").surname("Bayrak").address("Türkiye").build();

		System.out.println(person.getAddress());
	}

}
