package com.barsifedron.candid.cqrs.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.barsifedron", "com.barsifedron.candid.cqrs.springboot", "com.barsifedron.candid.cqrs.happy.domain", "com.barsifedron.candid.cqrs.springboot.cqrs.command"})
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
