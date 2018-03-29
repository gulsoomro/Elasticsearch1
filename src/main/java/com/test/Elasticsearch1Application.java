package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration(exclude={org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration.class})
public class Elasticsearch1Application {

	public static void main(String[] args) {
		SpringApplication.run(Elasticsearch1Application.class, args);
	}
}
