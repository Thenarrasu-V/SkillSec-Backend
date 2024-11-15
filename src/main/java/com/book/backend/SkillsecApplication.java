package com.book.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SpringBootApplication(scanBasePackages = {"com.book.backend"})
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class SkillsecApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkillsecApplication.class, args);
	}
}
