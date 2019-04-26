package com.uabc.database.example.examplejpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({WebSecurityConfig.class})
public class ExamplejpaApplication {


	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ExamplejpaApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ExamplejpaApplication.class, args);
	}

}
