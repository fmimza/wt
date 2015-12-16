package com.xc.wt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xc.wt.model.dao.TaskRepo;

@EnableWebMvc
@ComponentScan
@EnableJpaRepositories(basePackageClasses = TaskRepo.class)
@EnableAutoConfiguration
public class Starter {
	public static void main(final String... args) {
		SpringApplication.run(Starter.class, args);
	}
}
